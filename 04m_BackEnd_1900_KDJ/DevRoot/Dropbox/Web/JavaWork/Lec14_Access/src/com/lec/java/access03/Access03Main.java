package com.lec.java.access03;

import com.lec.java.access04.TestPublic2;
//import com.lec.java.access04.TestPublic;
//import com.lec.java.access04.TestDefault2;  // not visible 에러

// 클래스의 접근 권한 수식어: public, (default)
// 1. public class: 어디에서나 인스턴스 생성이 가능한 클래스
//   (주의) public 클래스의 이름은 .java 파일 이름과 반드시 같아야 함
// 2. (default) class: 같은 패키지에 있는 클래스들에서만 인스턴스 생성이 가능

public class Access03Main {

	public static void main(String[] args) {
		System.out.println("public, default 클래스");
		
		TestPublic t1 = new TestPublic();
		TestDefault t2 = new TestDefault();
		
		TestPublic2 t3 = new TestPublic2();
		
		// 애시당초 다른 패키지의 default 클래스는 import 자체가 안된다!
//		TestDefault2 t4;
		
		com.lec.java.access04.TestPublic t5 = new com.lec.java.access04.TestPublic();
		
	} // end main()

} // end class Access05Main

class Aaa{}
//public class Bbb{}
