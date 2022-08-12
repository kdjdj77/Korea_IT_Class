package com.lec.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
	private String name;
	private int age;
	private int grade;
	private char gender;
}
