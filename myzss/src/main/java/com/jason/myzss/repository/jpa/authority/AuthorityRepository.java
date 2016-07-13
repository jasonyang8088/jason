package com.jason.myzss.repository.jpa.authority;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.myzss.domain.authority.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
	
	public List<Authority> findAll();

}
