package com.lec.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bt01HelloBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bt01HelloBootApplication.class, args);
		System.out.println("안녕하세요");
	}

}
