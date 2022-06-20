package com.lec.java.array13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* java.util.Arrays 클래스
     배열을 다루는 유용한 메소드들 제공
		Arrays.toString() : 문자열 형태로 리턴
		Arrays.copyOf(원본배열, 복사할 length)
		Arrays.copyOfRange(원본배열, from, to))  : from 부터 to 직전까지 복사
		Arrays.fill()  : 배열에 특정 값으로 채우기
		Arrys.sort(원본배열) :  오름차순 변경
		Arrays.asList() : array -> List 로
 */
public class Array13Main {

	public static void main(String[] args) {
		System.out.println("java.util.Arrays 클래스");
	
		int [] arr = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(arr));
		
		int [] arr7 = {8, 9, 3, 5, 1, 2};
		System.out.println(Arrays.toString(arr7));
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
		
		int [] arr2 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr2));
		
		int [] arr4 = Arrays.copyOfRange(arr, 0, 2);  // 0부터 2 직전까지 복사
		System.out.println(Arrays.toString(arr4));
		
		
		System.out.println("\n프로그램 종료");
	} // end main

} // end class















