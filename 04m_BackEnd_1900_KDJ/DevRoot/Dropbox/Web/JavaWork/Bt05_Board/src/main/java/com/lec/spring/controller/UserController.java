package com.lec.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lec.spring.domain.User;
import com.lec.spring.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserController() {
		System.out.println(getClass().getName() + "() 생성");
	}
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public void loginOk() {}
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String registerOk(User user, Model model) {
		// 이미 중복된 아이디(username)이 있다면
		if(userService.isExist(user.getUsername())) {
			//TODO
		}
		// 에러가 있다면 redirect한다
		// TODO
		
		// 에러가 없다면 회원등록 진행
		String page = "/user/registerOk";
		int cnt = userService.register(user);
		model.addAttribute("result", cnt);
		return page;
	}
	
	@RequestMapping("/rejectAuth")
	public String rejectAuth() {
		return "common/rejectAuth";
	}
}
