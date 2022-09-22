package com.lec.spring.di06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config06 {
//	@Bean
	public DAO dao() {
		return new DAOImpl("DAO");
	}
}
