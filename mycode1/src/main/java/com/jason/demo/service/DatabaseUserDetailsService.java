package com.jason.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jason.demo.model.User;
import com.jason.demo.model.UserRepository;

//@Service

public class DatabaseUserDetailsService implements UserDetailsService {
	
	@Autowired(required = true)
	protected UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		User user = userRepository.findByEmail(username);
		return new MyUserDetails(user);
	}

}
