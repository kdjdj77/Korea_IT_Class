package com.lec.spring.domain;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() {
		User user = new User();
		user.setEmail("martin@gmail.com");
		user.setName("martin");
		user.setCreatedAt(LocalDateTime.now());
		user.setUpdatedAt(LocalDateTime.now());
		
		System.out.println(">>> " + user);
	}

}
