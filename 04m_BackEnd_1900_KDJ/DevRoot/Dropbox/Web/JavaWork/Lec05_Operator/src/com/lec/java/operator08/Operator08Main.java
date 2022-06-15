package com.lec.java.operator08;

/* 비트 연산자 (bit-wise operator)
 *   a & b: (and) a,b가 모두 1 이면 결과도 1, 그 외에는 0
 *   a | b: (or) a가 1이거나 또는 b가 1이면 결과는 1, a,b 모두 0일 때만 0
 *   a ^ b: (xor) a와 b 둘 중 하나만 1이 있는 경우는 1, 그 외에는 0
 *          결국 둘이 같으면 0, 다르면 1
 *    ~a  : (not) a가 1이면 0, a가 0이면 1로 바꿔줌
*/
public class Operator08Main 
{
	public static void main(String[] args) 
	{
		System.out.println("연산자 8 - 비트 연산자");
		System.out.println("[1] &(and), |(or), ^(exclusive or), ~(not)");
		
		int n1 = 10;  // 0000 0000 0000 0000 0000 0000 0000 1010
		int n2 = 7;   // 0000 0000 0000 0000 0000 0000 0000 0111
		int result = n1 & n2;
		System.out.println("& 결과 = " + result);
		System.out.println("& 결과 = " + Integer.toBinaryString(result));  // "10"
		
		/*
		 * 	0000 1010  n1
		 *	0000 0111  n2
		 *  ---------  &
		 *  0000 0010  2
		 */
		
		result = n1 | n2;
		System.out.println("| 결과 = " + result);  // 15
		System.out.println("| 결과 = " + Integer.toBinaryString(result)); // 1111
		/*
		 *   0000 1010  n1
		 *   0000 0111  n2
		 *   ---------- |
		 *   0000 1111  15
		 */ 
		
		result = n1 ^ n2;
		// TODO : 예측해보고 실행해보세요
		
		
		result = ~n1; 	// n1  : 0000 0000 0000 0000 0000 0000 0000 1010
		
						// ~n1 : 1111 1111 1111 1111 1111 1111 1111 0101
		System.out.println("~ 결과(10진수) = " + result);
		System.out.println("~ 결과(2진수) = " + Integer.toBinaryString(result));
		
		// 음수 정수 표현 참조 : http://tcpschool.com/c/c_refer_negativeNumber
		
		System.out.println("\n\n================");
		System.out.println("비트 이동(shift) 연산자: >>, <<");
		
		int n3 = 10;
		int result2 = n3 >> 1;   // 비트를 오른쪽(>>) 으로 1비트씩 이동
		System.out.println(">> 결과: " + result2);
		
		result2 = n3 << 1; // 비트를 왼쪽(<<) 으로 1비트씩 이동
		System.out.println("<< 결과: " + result2);
		
		result2 = n3 << 3;
		System.out.println("<< 결과: " + result2);
		
		// 10 * 2
		// 10 << 1
		
		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class







