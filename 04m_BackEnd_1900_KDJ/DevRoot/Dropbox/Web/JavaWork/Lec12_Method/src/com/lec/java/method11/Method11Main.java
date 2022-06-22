package com.lec.java.method11;

/* 재귀 호출 (recursive call)
 * 메소드(혹은 함수) 내부에서 메소드가 자기 자신을 또다시 호출하는 것.
 * 
 * 장점:
 * 	복잡한 문제를 간단하고 논리적으로 기술 가능.
 * 
 * 단점 & 주의 :
 *  메모리 부담 발생 
 * 	무한히 재귀호출 할수 없다. --> Stack Overflow 발생
 *   따라서 재귀호출은 '종료조건'이 반드시 필요하다.
 * 
 * 
 */
public class Method11Main {

	public static void main(String[] args) {
		System.out.println("재귀 호출 (recursive call)");
		System.out.println("재귀 메소드(recursive method)");
		
		// 무한정 재귀호출 안된다!  : StackOverFlowError
//		showNumber(1);
		
		// Heap 메모리 용량 초과 ?? : OutOfMemoryError
//		int n = Integer.MAX_VALUE;
//		double [] arr = new double[n];

		for(int i = 0; i <= 10; i++) {
			System.out.println(i + "! = " + calcFactorial(i));
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	public static void showNumber(int n) {
		System.out.println(n);
		showNumber(n + 1);  // 재귀호출?
		System.out.println("리턴: 찍힐까요?");
	}
	
	// 팩토리얼 고찰	
	// 4! = 4 * 3 * 2 * 1 = 24
	// n! = n * (n - 1) * (n - 2) * ...  * 1
	//    = n * (n - 1)!
	
	
	// method name: calcFactorial
	// return: long (num의 팩토리얼을 계산해서 리턴)
	// arguments: long num
	// 기능:
	//   if n == 0, 0! = 1
	//   if n > 0, n! = n * (n - 1)!
	//   if n < 0, 계산 불가
	public static long calcFactorial(long num) {
		long result = 0L;
		
		if(num == 0) {  // 종료조건    
			result = 1L;
		} else if(num > 0) {
			result = num * calcFactorial(num - 1); // 재귀호출
		} else {
			System.out.println("음수 팩토리얼은 계산할 수 없어요");
		}
		
		return result;
	}
	
	// 대부분의 recursive call 은 for/while 등의 순환문으로 전환 가능하다
	// 실습: calcFactorial 오버로딩 하여, for/while 문으로 구현해보기
	// TODO
	
	// method name: pow
	// return: double (n의 e승을 계산해서 리턴)
	// arguments: int n, int e
	// 기능:
	//   if e == 0, n^0 = 1
	//   if e > 0, n^e = n x n^(e-1)
	// TODO
	
	
	// method name: powerOfTwo
	// return: double (2의 n승을 계산해서 리턴)
	// arguments: int n
	// 기능:
	//   if n == 0, 2^0 = 1
	//   if n > 0, 2^n = 2 x 2^(n-1)
	//   if n < 0, 2^n = 1 / 2^(-n)
	// TODO
	
	
	
	
} // end class













