package com.lec.spring.di06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {
	@Autowired
	DoService service;
	
	public BoardController() {
		System.out.println("BoardController() 생성");
	}
	
	// DoService 주입받아 생성
	public BoardController(DoService service) {
		System.out.println("BoardController("+service+") 생성");
		this.service = service;
	}
}
