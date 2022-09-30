package com.lec.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 스프링에서 제공하는 기본 Listener 사용하기 위해
public class Bt04JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bt04JpaApplication.class, args);
	}

}
