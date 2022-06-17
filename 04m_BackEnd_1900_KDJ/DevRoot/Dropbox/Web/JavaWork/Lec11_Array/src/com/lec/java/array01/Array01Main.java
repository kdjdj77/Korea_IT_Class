package com.lec.java.array01;

/* 배열(Array)
 		동일 타입의 여러개의 데이터를 담는 집합자료형
 	
 	배열 선언
 		자료타입[] 변수이름;
 		
 	배열 원소 (element)
 		배열에 담긴 각각의 데이터
 		
 	배열의 길이 (length)
 		배열 원소의 개수, 즉 배열에 담긴 데이터의 개수 
 		
 	배열 인덱스 (첨자, index)
 		배열의 인덱스는 0부터 시작해서, (배열의 길이 - 1)까지가 됨
 		배열인덱스를 사용하여 배열원소에 접근하여 사용
 	
 	배열을 new로 생성한뒤에는 자동초기화 가 됨.
		숫자타입들은 --> 0으로
		boolean타입은 --> false 로
		객체타입(Object) 타입은 --> null 로.
 	
 	★ 배열변수의 타입, 배열원소의 타입 확실히 구분하자
 	★ JVM 메모리 상에 생기는 구조 이해 필수 
 */
public class Array01Main {

	public static void main(String[] args) {
		System.out.println("배열(Array)");
		
		// 배열이 필요한 이유.
		// 동일타입 데이터(들)을 위해 매번 새로운 변수생성 불가.
		int korean1 = 99;
		int korean2 = 88;
		int korean3 = 77;
		
		
		// 배열 선언 & 초기화
		int[] korean = new int[3];
		// int타입의 배열을 선언,
		// 3개의 int 타입을 저장할 수 있도록 초기화
		
		korean[0] = 90;   // 첫번째 배열원소에 int값 90을 대입
		korean[1] = 80;
		korean[2] = 70;
//		korean[3] = 60;   // Exception 발생
		
		System.out.println("국어0: " + korean[0]);
		System.out.println("국어1: " + korean[1]);
		System.out.println("국어2: " + korean[2]);
		
		// 위에서
		// 변수 korean 의 타입은?  -----> int[] 타입
		// 변수 korean[0] 의 타입은?  --> int 타입
		
		
		System.out.println("순환문 사용 하여 출력");
		for(int n = 0; n < 3; n++) {
			System.out.println(korean[n]);
		}
		
		
		System.out.println();
		// int 타입의 길이 5 인 배열 선언. 
		// 배열이름 english
		int[] english = new int[5];
		
		System.out.println(english[1]);  // 0.  <- new 로 생성한 것들은 자동 초기화
		
		for(int n = 0; n < 5; n++) {
			english[n] = n * 10;
		}
		
//		int aaa;
//		System.out.println(aaa);
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array01Main









