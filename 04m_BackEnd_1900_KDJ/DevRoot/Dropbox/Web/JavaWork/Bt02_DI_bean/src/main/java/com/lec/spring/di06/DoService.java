package com.lec.spring.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface DoService {}

@Service
class RegisterService implements DoService {
	
	@Autowired
	DAO dao;

	public RegisterService() {
		System.out.println("RegisterService() 생성");
	}
	
	public RegisterService(DAO dao) {
		System.out.printf("RegisterService(%s) 생성\n", dao);
		this.dao = dao;
	}
	
	@Override
	public String toString() {
		return String.format("[RegisterService : %s]", dao);
	}

}