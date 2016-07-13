package com.jason.myzss.service.authority.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jason.myzss.domain.authority.Authority;
import com.jason.myzss.repository.jpa.authority.AuthorityRepository;
import com.jason.myzss.service.authority.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	public List<Authority> findAll(){
		return authorityRepository.findAll();
	}

	@Override
	public void saveAll(List<Authority> authoritys) {
		authorityRepository.save(authoritys);
	}

	@Override
	public void save(Authority authority) {
		authorityRepository.saveAndFlush(authority);
	}

	@Override
	public void delete(Authority authority) {
		authorityRepository.delete(authority);
	}

	@Override
	public void delete(Long id) {
		authorityRepository.delete(id);
	}
}
