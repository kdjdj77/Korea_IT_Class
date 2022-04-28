package day_07;
import java.util.Scanner;

public class Review 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//10~1 출력
		for (int i = 10; i > 0; i--) System.out.print(i + " ");
		System.out.println();
		
	//1~10 합 출력
		int sum = 0, max = 100;	//sc.nextInt();
		for (int i = 0; i < max; i++) sum += i + 1;
		System.out.println(sum);
		
	//구구단
		int dan = 5;	//sc.nextInt();
		for (int i = 1; i < 10; i++)
			System.out.println(dan + " x " + i + " = " + (dan * i));
	
		sc.close();
	}
}
