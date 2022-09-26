package com.lec.spring.domain;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class UsersTest {

	@Test
	void test() {
		Users user = new Users();
		user.setEmail("martin@gmail.com");
		user.setName("martin");
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());
		
		System.out.println(">>> " + user);
	}

}
