package com.lec.spring;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Spring MVC에서 Controller역할을 하는 클래스로 컨테이너에 생성
public class HomeController {
	// Controller 안에는 request를 처리(handle) 하는 메소드들을 정의한다
	// 이러한 메소드들을 'handler' 라 한다.
	// handler 는 
	//  - '어떠한 request' 를 받아서, 
	//  - '어떠한 처리 (business logic)' 를 하고
	//  - '어떠한 response' 를 할지를 정의
	@RequestMapping("/") // "/"라는 url로 request가 오면 아래 메소드가 처리(handle)한다
	public String now(Model model) { // Model : 데이터를 실어 나르는 객체, View까지 전달된다
		System.out.println("now() 호출");
		
		LocalDateTime t = LocalDateTime.now();
		model.addAttribute("serverTime", t); // Model에 데이터 담기 (name, value)
		
		//prefix = /WEB-INF/views/
		//suffix=.jsp
		// "/WEB-INF/views/" + "home" + ".jsp"  => /WEB-INF/views/home.jsp  로 포워딩
		return "home";
	}
	@RequestMapping("/aaa")
	public String home(Model model) {
		System.out.println("home() 호출");
		
		int a = new Random().nextInt(10);
		int b = new Random().nextInt(5);
		
		model.addAttribute("first", a);
		model.addAttribute("second", b);
		
		return "aaa/my";
		// "/WEB-INF/views/" + "aaa/my" + ".jsp" 
		// => /WEB-INF/views/aaa/my.jsp
	}
	@RequestMapping("/aaa/bbb")
	public String aaabbb(Model model) {
		
		int a = new Random().nextInt(10);
		int b = new Random().nextInt(5);
		
		model.addAttribute("first", a);
		model.addAttribute("second", b);
		
		return "aaa/bbb/title";
		// "/WEB-INF/views/" + "aaa/bbb/title" + ".jsp"  
		// => /WEB-INF/views/aaa/bbb/title.jsp
	}
	
	// ModelAndView를 리턴
	// 'view' + 'Model'
	@RequestMapping("/member/infoView")
	public ModelAndView infoMember() {
		ModelAndView mv = new ModelAndView();
		
		// Model에 데이터 담기
		// addObject(name, value)
		mv.addObject("mbName", "원피스");
		mv.addObject("mbDate", "2022/09/23");
		
		// View 설정
		mv.setViewName("member/info");
		
		return mv;
	}
}
