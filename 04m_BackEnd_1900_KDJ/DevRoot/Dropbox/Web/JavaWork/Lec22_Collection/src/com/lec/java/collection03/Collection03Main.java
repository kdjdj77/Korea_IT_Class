package com.lec.java.collection03;

import java.util.ArrayList;
import java.util.List;

public class Collection03Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");
		
		//TODO:
		// Student 타입을 담는 ArrayList를 만드고
		// 사용자로부터 3개의 Student 데이터 을 입력받아서
		// 3가지 방법으로 출력해보세요. 
		// for, Enhanced-for, Iterator

		List<Student> list = new ArrayList<Student>();
		
		// Student 저장
		Score score1 = new Score(100, 90, 80);
		Student stu1 = new Student(1, "김남승", score1);
		list.add(stu1);
		
		Score score2 = new Score(80, 100, 90);
		Student stu2 = new Student(2, "김동혁", score2);
		list.add(stu2);
		
		Score score3 = new Score(80, 90, 100);
		Student stu3 = new Student(3, "김병기", score3);
		list.add(stu3);
		
		for(Student stu : list) {
			System.out.println(stu);			
		}
		
		// index 1 학생의 이름을 변경하려면?
		list.get(1).setName("배상아");
		
		System.out.println();
		for(Student stu : list) {
			System.out.println(stu);			
		}
		
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class
