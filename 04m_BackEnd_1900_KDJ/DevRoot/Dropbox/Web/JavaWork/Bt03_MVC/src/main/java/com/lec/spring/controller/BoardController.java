package com.lec.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lec.spring.domain.Write;

@Controller
@RequestMapping("/board")
public class BoardController {
	@GetMapping("/list") // /board/list
	//public void list(HttpServletRequest request, Model model) { // request 객체를 통해 매개변수 받아올 수 있음
	//public void list(Model model, HttpServletRequest request) { // handler의 매개변수 순서 관계없음
	public void list(int page, Model model) { // 핸들러 매개변수의 이름과 같은 parameter를 받아온다	
		//String p = request.getParameter("page");
		model.addAttribute("page", page);
	}
	@GetMapping("/info") // /board/info
	public void info(Integer a, Integer b, 
			@RequestParam("nn") String name, // nn이라는 이름의 parameter를 name 매개변수에 받아옴
			Model model) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("name = " + name);
		
		if (a == null) a = 0;
		if (b == null) b = 0;
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("result", a + b);
		model.addAttribute("name", name);
	}
	@GetMapping("/write") // /board/write
	public void write() {
		
	}
	@PostMapping("/write") // /board/write
	// public String writeOK(String name, String subject, String content) {
	// name="subject" ==> Write.setSubject() 로 받아옴
	// name="name" 	  ==> Write.setName() 로 받아옴
	// name="content" 	  ==> Write.setContent() 로 받아옴
	
	// 매개변수를 받아오는 객체를 커맨드 객체(Command object)라고 한다
	// 이 과정을 binding 이라고 한다
	public String writeOK(Write w) {
		System.out.println("POST: writeOk() 호출");
		//System.out.println("name : " + name);
		//System.out.println("subject : " + subject);
		//System.out.println("content : " + content);
		System.out.println(w);
		
		return "board/writeOK";
	}
}
