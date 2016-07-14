package com.jason.myzss.web.admin.authority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.authority.User;
import com.jason.myzss.repository.jpa.authority.UserRepository;

@RestController
@RequestMapping("/admin/authority")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	public void save(@RequestBody User user){
		
	}
}
