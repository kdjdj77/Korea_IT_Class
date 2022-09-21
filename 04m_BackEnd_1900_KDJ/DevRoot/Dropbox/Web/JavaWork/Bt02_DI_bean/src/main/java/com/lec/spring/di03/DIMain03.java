package com.lec.spring.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lec.spring.beans.Score;
import com.lec.spring.beans.Student;

@SpringBootApplication
public class DIMain03 implements CommandLineRunner{
	
	@Autowired
	Score scoreA; // 자동주입, 필드타입과 같은 bean이 컨테이너 안에 있으면 자동주입 받는다.
	@Autowired(required = false)
	Student stuA;
	@Autowired
	ApplicationContext ctx; // 생성된 스프링컨테이너
	
	public DIMain03() {
		System.out.println("DIMain03() 생성");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main3 시작");
		
		SpringApplication.run(DIMain03.class, args);
		
		System.out.println("Main3 종료");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run() 실행");
		
		System.out.println(scoreA);
		System.out.println(stuA);
		
		// 과연 아래 둘은 같은 객체일까?
		System.out.println(scoreA == stuA.getScore());
		
		// 컨테이너에 생성된 bean 의 '이름' 으로 
		// bean 객체를 받아올수 있다.
		System.out.println(ctx.getBean("score1"));
		System.out.println(ctx.getBean("stu1"));
	}
}
