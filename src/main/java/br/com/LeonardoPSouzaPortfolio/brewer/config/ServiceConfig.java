package br.com.LeonardoPSouzaPortfolio.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.LeonardoPSouzaPortfolio.brewer.service.CadastroCervejaService;

/**
 * 
 * @author leonardops
 *
 * Configura e localiza o pacote service
 */
@Configuration
@ComponentScan(basePackageClasses = CadastroCervejaService.class)
public class ServiceConfig {

}
