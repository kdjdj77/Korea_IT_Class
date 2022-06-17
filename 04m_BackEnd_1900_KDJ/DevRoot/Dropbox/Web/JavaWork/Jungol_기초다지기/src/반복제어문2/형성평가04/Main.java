package 반복제어문2.형성평가04;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < cnt; i++)
		{
			sum += sc.nextInt();
		}
		System.out.printf("%.2f",(double)sum / cnt);
	}
}
