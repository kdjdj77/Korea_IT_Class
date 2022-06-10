package com.lec.java.variables01;
/*
* 	변수 (Variables) :
* 		값을 담는 공간.  변수이름(variable name)을 부여해서 관리
* 		
* 	변수는 사용하기 전에 먼저 '선언(declaration)' 해야 한다
*	변수 선언:
*		변수타입 변수이름;
*		
*	변수의 초기화 (initialization)
*		변수에 최초로 값(value) 을 대입 (assignment) 하는 것.
*		변수(지역변수)를 사용/참조하려면 그전에 반드시 초기화가 되어야 함.
*	
*/
public class Variable01Main 
{
	public static void main(String[] args) 
	{

		int num1;    // int 타입의 변수 num1 을 선언 (int 타입, integer)
		int num2;
		
		num1 = 10;  // 변수 num1 에 정수값 10 을 대입
					// = : 대입연산자 (assignment operator)
		
		num2 = 20;
//		num3 = 30;  // 선언안된 변수는 사용 불가. 에러메세지 cannot be resolved
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		
		int num3;
//		System.out.println("num3 = " + num3);  // 초기화 되지 않은 변수는 사용불가
		
		// local variable (지역변수)
		// 지역 변수는 블럭안에서 선언된 변수
		// '선언된이후' 부터 '블럭의 마지막'까지만 사용 가능한 변수
		
		
		{
			int a;
			a = 100;
			System.out.println("a = " + a);
		}
//		System.out.println("a = " + a);
	} // end main()
} // end class
