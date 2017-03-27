package br.com.LeonardoPSouzaPortfolio.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.LeonardoPSouzaPortfolio.brewer.controller.CervejasController;

/**
 * 
 * @author leonardops
 * 
 * @Configuration - Anotação que aponta que a classe é uma configuração
 * @ComponentScan - Anotação aponta qual é o pacote de leitura dos controller
 * @EnableWebMvc - Anotação que habilita WEB MVC no projeto
 * extends WebMvcConfigurerAdapter - Adaptador do Spring para WEB MVC
 *
 */
@Configuration
@ComponentScan(basePackageClasses = { CervejasController.class })
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

} 