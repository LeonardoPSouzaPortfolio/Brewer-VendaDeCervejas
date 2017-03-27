package br.com.LeonardoPSouzaPortfolio.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	 * @return - Retorna a pagina HTML
	 */
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(Cerveja cerveja) {
		System.out.println(">>> sku: " + cerveja.getSku());
		return "cerveja/CadastroCerveja";
	}
	
}