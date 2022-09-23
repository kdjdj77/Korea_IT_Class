package com.lec.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member") // /member로 시작하는 request를 처리하는 컨트롤러
public class MemberController {
	
	@RequestMapping("/save") // /member/save 일때 처리
	public String saveMember() {
		
		return "member/save";
	}
	
	// @RequestMapping <- GET, POST ... 어떠한 request method도 처리
	@GetMapping("/load") // GET방식 request /member/load
	public void loadMember() {
		// handler가 리턴값이 없으면
		// request url을 view name으로 간주함 (/member/load.jsp)
		// 해당하는 view로 forwarding 수행
	}
	
	
}
