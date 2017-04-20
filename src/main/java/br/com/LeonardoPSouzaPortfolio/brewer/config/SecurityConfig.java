package br.com.LeonardoPSouzaPortfolio.brewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @EnableWebSecurity - habilita webSecurity
 *
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Autenticação e permissões
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("CADASTRO_CLIENTE");
	}
	
	/**
	 * url ignorada pela segurança
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
			.antMatchers("/layout/**")
			.antMatchers("/images/**");
	}
	
	/**
	 * configuração de autenticação
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.csrf().disable();
	}
	
	/**
	 * Metodo de criptografar senhas
	 * @return hash do BCcript
	 */
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}