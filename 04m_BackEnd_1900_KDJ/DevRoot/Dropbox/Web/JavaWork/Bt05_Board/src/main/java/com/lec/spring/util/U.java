package com.lec.spring.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lec.spring.config.PrincipalDetails;
import com.lec.spring.domain.User;

public class U {
	// 현재 request 구하기
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
		return attrs.getRequest();
	}
	
	// 현재 session 구하기
	public static HttpSession getSession() {
		return getRequest().getSession();
	}
	
	// 현재 로그인한 사용자 UserDetail 구하기
	public static User getLoggedUser() {
		// 현재 로그인한 작성자 정보
		PrincipalDetails userDetails = (PrincipalDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = userDetails.getUser();
		return user;
	}
}
