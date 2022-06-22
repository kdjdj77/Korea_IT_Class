package practice.capitalize;

import java.util.Arrays;
import java.util.Scanner;

/* LetterCapitalize
 * 	문장을 입력하고,  단어의 앞 문자를 대문자로 만들고 (나머지는 소문자로 )출력하기를 반복하다가
 *  quit 을 입력 받으면 종료하기
 * 
 * 	[입력예]
 * 		hello my world
 *  [출력예]
 * 		Hello My World  
 */

public class LetterCapitalize {
	
	// TODO : 필요한 메소드 있으면 추가 작성
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str;
		while(true) {
			str = sc.nextLine();
			if(str.trim().equalsIgnoreCase("quit")) break;
			System.out.println(capitalize(str));
		}
		
		sc.close();
	} // end main()
	
	public static String capitalize(String str) {
		str = str.toLowerCase();   // 일단 전체를 소문자로 변환
		String [] words = str.split("\\s+");  // 공백기준으로 단어 구분
		
		String result = "";
		for(String word : words) {
			// 맨앞글자를 떼내어 대문자로
			result += word.substring(0, 1).toUpperCase() + 
					word.substring(1) + " ";					
		}
		
		return result;
	}
	
	
	
} // end class
















