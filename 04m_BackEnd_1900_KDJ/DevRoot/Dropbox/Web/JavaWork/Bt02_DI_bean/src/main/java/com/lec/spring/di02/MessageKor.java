package com.lec.spring.di02;

import org.springframework.stereotype.Component;

import com.lec.spring.beans.MessageBean;
/*
	org.springframework.stereotype 이하의 annotation 이 붙은 class는
	스프링 컨테이너 생성시 bean 으로 생성된다.
	ex) @Component
*/
//@Component
public class MessageKor implements MessageBean{
	String msgKor = "안녕하세요";
	
	//생성자 : 언제 생성되는지 주목
	public MessageKor() {
		System.out.println("MessageKor 생성");
	}
	
	@Override
	public void sayHello() {
		System.out.println(msgKor);
	}
}
