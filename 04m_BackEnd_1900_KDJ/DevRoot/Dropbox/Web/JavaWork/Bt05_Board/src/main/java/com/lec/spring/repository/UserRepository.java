package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
