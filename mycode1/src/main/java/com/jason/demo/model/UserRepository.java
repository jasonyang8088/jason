package com.jason.demo.model;

import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {

	public User findByEmail(String email);

}