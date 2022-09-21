package com.lec.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Bt01HelloBootApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("테스트입니다" + 4/0);
	}

}
