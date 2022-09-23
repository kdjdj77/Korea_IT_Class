package com.lec.spring.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Write {
	private String name;	// 작성자
	private String subject;	// 제목
	private String content;	// 내용
	private Integer age;
}
