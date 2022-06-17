package com.lec.java.while03;

public class While03Main 
{
	public static void main(String[] args) 
	{
		System.out.println("while 연습");
		
		// 1 ~ 10 까지 숫자 중에서 홀수만 출력
		
		int n = 1;
		while(n <= 10) 
		{
			if(n % 2 == 1) 
			{				
				System.out.println(n);
			}
			n++;
		}
		

	} // end main()

} // end class While03Main









