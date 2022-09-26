package com.lec.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	@ResponseBody	// 리턴하는 값 그 자체를 response
	public String helloWorld() {
		return "hello-world"; // 뷰가 아니라 문자열 리턴(responsebody)
	}
}
