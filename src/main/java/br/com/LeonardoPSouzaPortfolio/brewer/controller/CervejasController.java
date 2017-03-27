package br.com.LeonardoPSouzaPortfolio.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;
/**
 * 
 * @author leonardops
 *
 * @Controller - Aponta que a classe é um controller
 */
@Controller
public class CervejasController {

	/**
	 * @RequestMapping - Mapeia o URL numa requisição GET
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}
	
	/**
	 * @RequestMapping - Mapeia o URL numa requisição POST
	 * @Valid - Valida um objeto
	 * BindingResult result - Mante os resultados
	 * Model - Para forward
	 * RedirectAttributes - Para Redirect
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "cerveja/CadastroCerveja";
		}
		
		// Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println(">>> sku: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
	
}