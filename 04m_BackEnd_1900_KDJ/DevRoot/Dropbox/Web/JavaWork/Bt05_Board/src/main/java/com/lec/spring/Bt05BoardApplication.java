package com.lec.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // 스프링의 기본 Listener 작동시키기
public class Bt05BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bt05BoardApplication.class, args);
	}

}
