package br.com.LeonardoPSouzaPortfolio.brewer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.LeonardoPSouzaPortfolio.brewer.controller.page.PageWrapper;
import br.com.LeonardoPSouzaPortfolio.brewer.dto.CervejaDTO;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Origem;
import br.com.LeonardoPSouzaPortfolio.brewer.model.Sabor;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Cervejas;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Estilos;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.filter.CervejaFilter;
import br.com.LeonardoPSouzaPortfolio.brewer.service.CadastroCervejaService;
import br.com.LeonardoPSouzaPortfolio.brewer.service.exception.ImpossivelExcluirEntidadeException;
/**
 * 
 * @author leonardops
 *
 * @Controller - Aponta que a classe é um controller
 * @RequestMapping - Mapeia a classe
 */
@Controller
@RequestMapping("/cervejas")
public class CervejasController {
	
	@Autowired
	private Estilos estilos;
	
	@Autowired
	private CadastroCervejaService cadastroCervejaService;
	
	@Autowired
	private Cervejas cervejas;

	/**
	 * @RequestMapping - Mapeia o URL numa requisição GET
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping("/novo")
	public ModelAndView novo(Cerveja cerveja) {
		ModelAndView mv = new ModelAndView("cerveja/CadastroCerveja");
		mv.addObject("sabores", Sabor.values());
		mv.addObject("estilos", estilos.findAll());
		mv.addObject("origens", Origem.values());
		return mv;
	}
	
	/**
	 * @RequestMapping - Mapeia o URL numa requisição POST
	 * @Valid - Valida um objeto
	 * BindingResult result - Mante os resultados
	 * Model - Para forward
	 * RedirectAttributes - Para Redirect
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(cerveja);
		}
		
		cadastroCervejaService.salvar(cerveja);
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return new ModelAndView("redirect:/cervejas/novo");
	}
	
	/**
	 * Método de pesquisar
	 * @param cervejaFilter - Faz o filtro da cerveja
	 * @param result - Mante os resultados
	 * @param pageable - Responsável pela paginação
	 * @param httpServletRequest - Para manter a pesquisa e evitar problemas de espacamento na URL (ex: %20)
	 * @return - Retorna a pagina HTML
	 */
	@GetMapping
	public ModelAndView pesquisar(CervejaFilter cervejaFilter, BindingResult result
			, @PageableDefault(size = 2) Pageable pageable, HttpServletRequest httpServletRequest) {
		ModelAndView mv = new ModelAndView("cerveja/PesquisaCervejas");
		mv.addObject("estilos", estilos.findAll());
		mv.addObject("sabores", Sabor.values());
		mv.addObject("origens", Origem.values());
		
		PageWrapper<Cerveja> paginaWrapper = new PageWrapper<>(cervejas.filtrar(cervejaFilter, pageable)
				, httpServletRequest);
		mv.addObject("pagina", paginaWrapper);
		return mv;
}
	
	/**
	 * Método responsável por pesquisar sku ou nome
	 * @param skuOuNome - parametro para distinguir a pesquisa
	 * @return retorna a pesquisa por nome ou sku
	 */
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CervejaDTO> pesquisar(String skuOuNome) {
		return cervejas.porSkuOuNome(skuOuNome);
	}
	
	@DeleteMapping("/{codigo}")
	public @ResponseBody ResponseEntity<?> excluir(@PathVariable("codigo") Cerveja cerveja) {
		try {
			cadastroCervejaService.excluir(cerveja);
		}catch (ImpossivelExcluirEntidadeException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		return ResponseEntity.ok().build();
	}
	
}