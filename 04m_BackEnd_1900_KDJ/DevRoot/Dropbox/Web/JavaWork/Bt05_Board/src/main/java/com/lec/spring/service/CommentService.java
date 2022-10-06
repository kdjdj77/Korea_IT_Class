package com.lec.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.spring.repository.CommentRepository;
import com.lec.spring.repository.UserRepository;
import com.lec.spring.repository.WriteRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private WriteRepository writeRepository;
	
	public CommentService() {
		System.out.println(getClass().getName() + "() 생성");
	}
}
