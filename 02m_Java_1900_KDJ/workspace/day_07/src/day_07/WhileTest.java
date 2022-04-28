package day_07;
import java.util.Scanner;

public class WhileTest 
{
	public static void main(String[] args) 
	{
	//while문
		int i = 0;
		while(i < 3) 
		{
			System.out.print("hi ");
			i++;
		}
		System.out.println("hello");
		
	//for문
		for (i = 0; i < 3; i++) System.out.print("hi ");
		System.out.println("hello");
		
	//키오스크
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do
		{
			System.out.println("1. 송금하기");
			System.out.println("2. 입금하기");
			System.out.println("0. 마감하기");
			choice = sc.nextInt();
		}
		while (choice != 0);
		{
			if (choice == 1) System.out.println("송금");
			else if (choice == 2) System.out.println("입금");
			else if (choice != 0) System.out.println("재입력해주세요");
		}
		System.out.println("종료");
		sc.close();
	}
}