package com.jason.myzss.service.authority;

import java.util.List;

import com.jason.myzss.domain.authority.Role;

public interface RoleService {

	public List<Role> findAll();

	public void save(Role role);
		
}
