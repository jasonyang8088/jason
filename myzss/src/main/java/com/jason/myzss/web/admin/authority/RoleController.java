package com.jason.myzss.web.admin.authority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.authority.Role;
import com.jason.myzss.repository.jpa.authority.RoleRepository;

@RestController
@RequestMapping("/admin/authority")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@RequestMapping(value="/roles",method=RequestMethod.GET)
	public List<Role> getRoles(){
		return roleRepository.findAll();
	}
	
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public void saveRole(@RequestBody Role role){
		roleRepository.save(role);
	}
	
	@RequestMapping(value="/role",method=RequestMethod.PUT)
	public void updateRole(@RequestBody Role role){
		roleRepository.saveAndFlush(role);
	}

}
