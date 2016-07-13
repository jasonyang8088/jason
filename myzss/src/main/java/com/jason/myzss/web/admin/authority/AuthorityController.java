package com.jason.myzss.web.admin.authority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.authority.Authority;
import com.jason.myzss.service.authority.AuthorityService;

@RestController
@RequestMapping("/admin/authority")
public class AuthorityController {
	
	@Autowired
	private AuthorityService authorityService;
	
	@RequestMapping(value="/authoritys",method=RequestMethod.GET)
	public List<Authority> findAll(){
		return authorityService.findAll();
	}
	
	@RequestMapping(value="/authority",method=RequestMethod.POST)
	public void save(@RequestBody Authority authority){
		authorityService.save(authority);
	}
	
	@RequestMapping(value="/authority",method=RequestMethod.PUT)
	public void update(@RequestBody Authority authority){
		authorityService.save(authority);
	}
	
	@RequestMapping(value="/authority/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")Long id){
		authorityService.delete(id);
	}

}
