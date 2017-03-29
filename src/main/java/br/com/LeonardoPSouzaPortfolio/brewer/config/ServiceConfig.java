package br.com.LeonardoPSouzaPortfolio.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.LeonardoPSouzaPortfolio.brewer.service.CadastroCervejaService;
import br.com.LeonardoPSouzaPortfolio.brewer.storage.FotoStorage;
import br.com.LeonardoPSouzaPortfolio.brewer.storage.local.FotoStorageLocal;

/**
 * 
 * @author leonardops
 *
 * Configura e localiza o pacote service
 */
@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {
	
	@Bean
	public FotoStorage fotoStorage() {
		return new FotoStorageLocal();
	}

}
