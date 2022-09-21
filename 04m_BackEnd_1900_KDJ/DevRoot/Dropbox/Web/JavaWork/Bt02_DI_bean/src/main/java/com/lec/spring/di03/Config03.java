package com.lec.spring.di03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lec.spring.beans.Score;
import com.lec.spring.beans.Student;

/* JAVA 를 이용한 DI 설정
	클래스 이름앞에 반드시 어노테이션 명시 필요
	@Configuration --> 이 클래스는 '스프링 설정'에 사용되는 클래스 입니다. 
	결국 IOC 컨테이너에 생성되는 bean 들을 기술하는 클래스 --> @Bean 사용
*/
@Configuration
public class Config03 {
	public Config03() {
		System.out.println("Config03() 생성");
	}
	
	// 리턴 타입 Score 빈 생성
	@Bean
	public Score score1() { // ← '메소드 이름 score1' 이  getBean(name) 의 name 값이 된다!
		System.out.println("score1() 호출");
		return new Score(100, 80, 75, "좋아요");
	}
	// 리턴 타입 Student 빈 생성
	@Bean
	public Student stu1() {
		return new Student("홍길동", 34, score1());
	}
	
	// 동일한 type 의 bean 을 설정해 놓으면
	// DIMain03 에서 scoreA 에 자동주입 받을시 에러 발생
/*	@Bean
	public Score score2() {
		System.out.println("score2() 호출");
		return new Score(77, 88, 23, "이게 점수냐?");
	}*/
}
