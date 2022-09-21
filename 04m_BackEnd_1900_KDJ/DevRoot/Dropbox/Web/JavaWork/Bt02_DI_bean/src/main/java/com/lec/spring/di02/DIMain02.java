package com.lec.spring.di02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lec.spring.beans.MessageBean;
/*
Dependency Injection (DI, 의존주입)
필요한 객체는 누가 만들어 사용하나?

방법2 : 외부에서 만들어 주입 (injection)
	스프링 특징 의존주입 (Dependenty Injection) 사용
	즉 '외부' 에서 만들어 놓은 것을 가져옴.
*/

@SpringBootApplication	// 아래 객체도 스프링 컨테이너 안에 빈bean 객체로 생성
public class DIMain02 implements CommandLineRunner{
	public MessageBean msg;
	
	@Autowired	// 자동주입 : 컨테이너 안의 생성된 bean 객체를 주입받는다
	public void setMsg(MessageBean msg) {
		System.out.println("setMsg() 호출");
		this.msg = msg;
	}
	
	public DIMain02() {
		System.out.println("DIMain02 생성");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		SpringApplication.run(DIMain02.class, args);
		
		System.out.println("Main 종료");
	}

	@Override
	public void run(String... args) throws Exception {
		msg.sayHello();
	}
}
