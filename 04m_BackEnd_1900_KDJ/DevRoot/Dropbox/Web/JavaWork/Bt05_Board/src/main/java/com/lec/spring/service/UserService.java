package com.lec.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public UserService() {
		System.out.println(getClass().getName() + "() 생성");
	}
}
