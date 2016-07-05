package com.jason.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.jason.demo.service.DatabaseUserDetailsService;
import com.jason.demo.service.UserAccountService;


@Configuration
public class AuthenticationSecurity  extends GlobalAuthenticationConfigurerAdapter{
	
	@Autowired
	private UserAccountService userAccountService;
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService());
	}

	@Bean
	public UserDetailsService userDetailsService() {
		System.err.println("Creating DatabaseUserDetailsService; userAccountService = " + userAccountService);
		return new DatabaseUserDetailsService();
	}

}
