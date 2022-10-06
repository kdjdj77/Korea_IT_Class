package com.lec.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

// 스프링 시큐리티 설정
@Configuration   // 스프링 컨테이너에 빈 으로 생성
@EnableWebSecurity  // WebSecurity 를 활성화 해준다.
		// 아래 스프링 시큐리티 필터가 스프링 필터 체인에 등록이 된다.
public class SecurityConfig {

}
