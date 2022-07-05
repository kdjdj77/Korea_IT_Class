package com.lec.java.lambda01;

/* 람다 표현식: lambda-expression
 	Java8 부터 도입:
		(매개변수 리스트) -> 리턴값
		(매개변수 리스트) -> {...}  수행코드

	추상메소드가 하나인 인터페이스 구현, 즉 익명클래스사용 더 간략화한 표현식
 */
public class Lambda01Main {

	public static void main(String[] args) {
		System.out.println("인터페이스, 익명 클래스, 람다 표현식");
		
		System.out.println();
		System.out.println("[1] 인터페이스를 구현하는 클래스");
		Addable myAdder = new AdderImple();
		double result = myAdder.add(1.11, 2.22);
		System.out.println("result = " + result);
///////////////////////////////////////////////////////////////				
		System.out.println();
		System.out.println("[2] 익명 클래스 사용");
		Addable myAdder2 = new Addable() {
			@Override
			public double add(double x, double y) {
				return x + y;
			}
		};
		result = myAdder2.add(1.11, 2.22);
		System.out.println("result = " + result);
///////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("[3] 람다 표현식(lambda expression) 사용");
		Addable myAdder3 = (a, b) -> a + b;
		result = myAdder3.add(1.11, 2.22);
		System.out.println("result = " + result);
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

//인터페이스 정의
interface Addable {
	public abstract double add(double x, double y);
//	int sub(int a, int b);  // 에러	
} // end interface Adder

//인터페이스를 구현하는 클래스를 정의
class AdderImple implements Addable{
	@Override
	public double add(double x, double y) {
		return x + y;
	}
}
