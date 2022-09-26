package com.lec.spring.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//Spring MVC 에서 컨트롤러를 테스트 한다는 건.
//'request' 처리, 입력값검사, 요청한 데이터 확인, 비즈니스 로직 호출, 다음 화면 이동 등.. 을 확인하는것

//Spring MVC 를 테스트 하려면, 프레임워크가 통합된 상태로 해야 한다. 그래서
//MVC 테스트 할수 있도록 MockMVC 객체를 만들어 줍니다.
//MockMVC 는 웹 애플리케이션을 서버에 배포하지 않도로 스프링 MVC 의 동작을 재현할수 있는 객체
@WebMvcTest
class HelloWorldControllerTest {
	
	@Autowired
	private MockMvc mockMvc; // MockMvc 주입받음
	
	@Test
	void helloWorld() throws Exception{
		// get방식 요청을 테스트
		mockMvc.perform(MockMvcRequestBuilders.get("/helloworld"))
			.andDo(print())	// request-response 정보 출력
			.andExpect(status().isOk())	// 200 response code를 기대함
			.andExpect(content().string("hello-world"))
			;
	}

}
