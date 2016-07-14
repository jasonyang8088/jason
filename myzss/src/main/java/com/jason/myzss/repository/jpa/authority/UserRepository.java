package com.jason.myzss.repository.jpa.authority;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.myzss.domain.authority.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
