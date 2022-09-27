package com.lec.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.spring.repository.WriteRepository;

@Service
public class BoardService {
	private WriteRepository writeRepository;

	@Autowired
	public void setWriteRepository(WriteRepository writeRepository) {
		this.writeRepository = writeRepository;
	}
	
	public BoardService() {
		System.out.println(getClass().getName() + "() 생성");
	}
}
