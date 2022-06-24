package com.lec.java.class04;
/*
   클래스 안에서 this : 
	객체 내에서 자기자신(인스턴스)을 가리킴

   메소드 체이닝 (method chaining)
 	자기자신을 리턴하여, 연이어 메소드
 	호출 가능케 하는 메소드 설계
 	보통 setter 와 이와 같은 동작을 수행하는 메소드들에 적용하면 좋다
*/
public class Class04Main {

	public static void main(String[] args) {
		System.out.println("this & 메소드 체이닝");
		
		Number n1 = new Number();
		System.out.println("n1.num = " + n1.getNum());

		Number n2 = new Number(123);
		System.out.println("n2.num = " + n2.getNum());
		
		System.out.println();
		n1.add(n2);
		System.out.println("n1.num = " + n1.getNum());
		System.out.println("n2.num = " + n2.getNum());

		System.out.println();
		n2.add(new Number(50));
		System.out.println("n1.num = " + n1.getNum());
		System.out.println("n2.num = " + n2.getNum());
		
		n2.setNum(100);
		
		n1.add(n2);
		n1.add(n2);
		n1.add(n2);
		n1.sub(new Number(10));
		n1.sub(n2);
		
		// 매번 위와 같이 동일객체 n1.xxx() 을 반복하는게 비효율
		
		
		n1.setNum(100);
		n2.setNum(50);
		
		n1.add(n2).add(n2).add(n2);
		System.out.println("n1.num = " + n1.getNum());

		
		
		
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class04Main

