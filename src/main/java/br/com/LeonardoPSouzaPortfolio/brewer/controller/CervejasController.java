package br.com.LeonardoPSouzaPortfolio.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.LeonardoPSouzaPortfolio.brewer.model.Cerveja;
import br.com.LeonardoPSouzaPortfolio.brewer.repository.Cervejas;
/**
 * 
 * @author leonardops
 *
 * @Controller - Aponta que a classe é um controller
 */
@Controller
public class CervejasController {
	
	@Autowired
	private Cervejas cervejas;

	/**
	 * @RequestMapping - Mapeia o URL numa requisição GET
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		cervejas.findAll(); // Apagar...
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
			return novo(cerveja);
		}
		
		// Salvar no banco de dados...
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		System.out.println(">>> sku: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
	
}