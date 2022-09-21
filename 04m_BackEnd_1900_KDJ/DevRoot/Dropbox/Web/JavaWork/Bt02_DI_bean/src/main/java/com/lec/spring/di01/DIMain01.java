package com.lec.spring.di01;

import com.lec.spring.beans.MessageBean;

/*
	Dependency Injection (DI, 의존주입)
	필요한 객체는 누가 만들어 사용하나?

	방법1 : 직접 생성하여 사용
*/

public class DIMain01 {
	public MessageBean msg;
	
	public void setMsg(MessageBean msg) {
		this.msg = msg;
	}
	
	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		DIMain01 app = new DIMain01();
		app.test();
		
		System.out.println("Main 종료");
	}
	
	public void test() {
		//필요한 MessageBean 객체를
//		msg = new MessageKor();	//직접 만들어 사용
//		msg.sayHello();
		
		//나중에 설계 변경된 다른 버전의 MessageBean을 사용하려면
		msg = new MessageEng();	//직접 만들어 사용
		msg.sayHello();
	}
	
	/* 문제점
		MessageBean을 사용하던(의존하던) 모든 곳에서
		코드 수정 + 재컴파일 필요
	*/
}
