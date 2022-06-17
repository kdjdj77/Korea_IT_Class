package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		int sum = 0;
		while (true)
		{
			num = sc.nextInt();
			if (num < 0 || num > 100) break;
			sum += num;
			cnt++;
		}
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.1f\n", (double)sum / cnt);
		
		sc.close();
	}
}
