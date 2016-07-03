/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jason.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.jason.demo.service.DatabaseUserDetailsService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
	
	// @formatter:off
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//				.withUser("user").password("password").roles("USER");
//	}
	
    @Override  
    public void configure(WebSecurity web) throws Exception {  
        // 设置不拦截规则  
        web.ignoring().antMatchers("/css/**", "/js/**");  
  
    }  
	
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login") 
				.failureUrl("/login?error")
				.permitAll().and()
			.logout()
				.permitAll();
	}
	
	 @Override  
	    protected void configure(AuthenticationManagerBuilder auth)  
	            throws Exception {  
	  
	        // 自定义UserDetailsService  
//	        auth.userDetailsService(userDetailsService()).passwordEncoder(  
//	                new Md5PasswordEncoder());  
		 auth.userDetailsService( userDetailsService());
	    }  
	
	@Bean
   public DatabaseUserDetailsService userDetailsService() {  
        DatabaseUserDetailsService userDetailsService = new DatabaseUserDetailsService();  
        return userDetailsService;  
    }  
	// @formatter:on
}
