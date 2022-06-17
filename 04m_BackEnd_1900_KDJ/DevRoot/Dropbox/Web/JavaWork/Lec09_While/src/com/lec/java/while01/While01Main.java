package com.lec.java.while01;

/*
 	조건식이 true 인 동안 while 블럭 반복
 	
 	while(조건식 true / false){
 		.. 
 		..
 	}
 
 */
public class While01Main 
{
	public static void main(String[] args) 
	{
		System.out.println("while 반복문");
		
		int i = 1; // '초기식'
		while(i <= 10) {  // '조건식'
			// '수행블럭'
			System.out.println(i);
			i++;
		}
		System.out.println("while 종료후 i = " + i );
		
		
		// 10, 9, 8... ,1
		System.out.println();
		
		i = 10;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
		// 현재 i 값은??????????????
		System.out.println("while 종료후 i = " + i );
		
		System.out.println("\n프로그램 종료");

	} // end main()
	
} // end class While01Main









