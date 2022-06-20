package com.lec.java.array05;

import java.util.Scanner;

/* 2차원 배열 (2-dimensional array)
 * 	직전의 예제와 같이 같이 배열 첨자를 하나만 쓰는 배열을 
 *  1차원 배열 (one-dimensional array) 이라고 함
 *   배열 첨자를 2개사용하면 2차원 배열
 *   배열 첨자를 3개사용하면 3차원 배열
 *   ...
 *  
 *   배열원소가 '1차원 배열' 들로 이루어진 배열을 2차원 배열 이라 한다  (배열첨자 2개 사용)
 *   배열원소가 '2차원 배열' 들로 이루어진 배열을 3차원 배열 이라 한다  (배열첨자 3개 사용)
*/
public class Array05Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		
		int[] arr1;  // arr1 의 타입은 int[]  <- int 1차원 배열
		
		int[][] array = {  // array 의 타입은 int[][]  <- INT 2차원 배열
				{1, 2},  // <-- array[0]
				{3, 4},
				{5, 6}
		};
		
		
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);		
		System.out.println(array[2][0]);
		System.out.println(array[2][1]);
		
		// ※ 흔히 2차원 배열을 행과 열로 표현하기도 함
		// array 는 행(row) 3개, 열(column)이 2개인 2차원 배열
		
		// 2차원 배열에서 length의 의미:
		// array.length: 2차원 배열의 원소, 즉 1차원배열의 개수 
		//  			행열의 개념에선 2차원 배열의 행(row)의 개수를 의미
		
		System.out.println("array.length = " + array.length);
		System.out.println("array[0].length = " + array[0].length);
		
		// array 의 타입은? --> int[][]
		// array[0] 의 타입은? --> int[]
		// array[0][0] 의 타입은? --> int
		
		System.out.println(array);
		
		// 2차원 배열 확인
		for(int x = 0; x < array.length; x++) {
			for(int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array05Main









