package com.lec.spring.di04;

import org.springframework.stereotype.Component;

import com.lec.spring.beans.MessageBean;

@Component("KOR") // 이름이 "KOR"인 MessageBean타입 bean 생성
public class MessageKor implements MessageBean{
	String msgKor = "안녕하세요";
	
	//생성자 : 언제 생성되는지 주목
	public MessageKor() {
		System.out.println("MessageKor() 생성");
	}
	
	@Override
	public void sayHello() {
		System.out.println(msgKor);
	}
}
