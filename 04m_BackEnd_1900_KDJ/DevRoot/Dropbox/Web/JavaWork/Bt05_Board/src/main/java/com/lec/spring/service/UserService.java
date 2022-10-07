package com.lec.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lec.spring.domain.Authority;
import com.lec.spring.domain.User;
import com.lec.spring.repository.AuthorityRepository;
import com.lec.spring.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private AuthorityRepository authorityRepository;
	
	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Autowired
	public void setAuthorityRepository(AuthorityRepository authorityRepository) {
		this.authorityRepository = authorityRepository;
	}
	@Autowired
	private PasswordEncoder passwordEncoder; // 회원가입 등에서 사용
	public UserService() {
		System.out.println(getClass().getName() + "() 생성");
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	// 특정 id의 User의 Authority들을 리턴
	public List<Authority> selectAuthoritiesById(Long id) {
		User user = userRepository.findById(id).orElse(null);
		if (user != null) return user.getAuthorities();
		return new ArrayList<>();
	}
	
	// 주어진 username의 회원이 존재하는지 확인 (회원가입 등에서 활용)
	public boolean isExist(String username) {
		User user = userRepository.findByUsername(username);
		if (user != null) return true;
		return false;
	}
	
	// 회원등록
	public int register(User user) {
		user.setUsername(user.getUsername().toUpperCase()); // 대문자로 저장
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user = userRepository.save(user); // 저장
		
		// 신규 회원은 ROLE_MEMBER 권한 기본적으로 부여
		Authority auth = authorityRepository.findByName("ROLE_MEMBER");
		user.addAuthority(auth);
		userRepository.save(user);
		return 1;
	}
}
