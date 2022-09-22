package com.lec.spring.di05;

import org.springframework.stereotype.Component;

import com.lec.spring.beans.MessageBean;

public class MessageEng implements MessageBean{
	String msgEng = "Good Morning";
	
	//생성자 : 언제 생성되는지 주목
	public MessageEng() {
		System.out.println("MessageEng() 생성");
	}

	@Override
	public void sayHello() {
		System.out.println(msgEng);
		
	}

}
