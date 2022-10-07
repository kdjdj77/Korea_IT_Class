package com.lec.spring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("/home")
	public void home() {}
	
	// 현재 로그인한(인증된) 정보 Authentication 보기
	@RequestMapping("/auth")
	@ResponseBody
	public Authentication auth() {
		return SecurityContextHolder.getContext().getAuthentication();
	}
}
