package com.jason.myzss.service.authority;

import java.util.List;

import com.jason.myzss.domain.authority.Authority;

public interface AuthorityService {

	public List<Authority> findAll();

	public void saveAll(List<Authority> authoritys);

	public void save(Authority authority);

	public void delete(Authority authority);

	public void delete(Long id);
}
