package com.lec.spring.di06;

import org.springframework.stereotype.Repository;

public interface DAO {}

//DAO를 상속받은 클래스
@Repository
class DAOImpl implements DAO {
	String uid;
	
	public DAOImpl() {
		System.out.println("DAOImpl() 생성");
	}

	public DAOImpl(String uid) {
		System.out.printf("DAOImpl(%s) 생성\n", uid);
		this.uid = uid;
	}
	
	@Override
	public String toString() {
		return String.format("[DAOImpl: %s]", this.uid);
	}
}