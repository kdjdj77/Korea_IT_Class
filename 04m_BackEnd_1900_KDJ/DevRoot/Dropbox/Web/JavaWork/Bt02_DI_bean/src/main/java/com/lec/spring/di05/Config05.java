package com.lec.spring.di05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.lec.spring.beans.MessageBean;
import com.lec.spring.beans.Score;
import com.lec.spring.beans.Student;

@Configuration
public class Config05 {
	public Config05() {
		System.out.println("Config05() 생성");
	}
	@Bean
	public Score scoreA() {
		return new Score(100, 80, 75, "좋아요");
	}
	@Bean
	public Score scoreB() {
		return new Score(24, 42, 35, "나빠요");
	}
	@Bean(name = "Hong")
	public Student stu1() {
		return new Student("홍길동", 19, scoreA());
	}
	@Bean(name = "Jung")
	public Student stu2() {
		return new Student("정대만", 25, scoreB());
	}
	@Bean
	@Primary  // 동일한 타입의 빈이 여러개 있을때 autowired 되는 우선순위
	public MessageBean msg1() {
		return new MessageEng();
	}
	@Bean(name = "ko")
	public MessageBean msg2() {
		return new MessageKor();
	}
}
