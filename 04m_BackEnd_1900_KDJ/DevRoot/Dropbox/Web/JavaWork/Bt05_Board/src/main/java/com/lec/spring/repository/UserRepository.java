package com.lec.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lec.spring.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// 로그인한 사용자 username으로 찾기
	User findByUsername(String username);
}
