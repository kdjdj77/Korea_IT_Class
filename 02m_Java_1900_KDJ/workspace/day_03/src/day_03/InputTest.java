package day_03;
import java.util.Scanner;

public class InputTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//sc.next(); //입력을 받아서 값을 String타입으로 받아온다
		
		//000님 환영합니다
		//000님은 VIP입니다
/*
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.printf("%s님 환영합니다\n", name);
		System.out.printf("%s님은 VIP입니다\n", name);
*/
		
		//next() : 입력을 받아서 값을 String 타입으로 받아온다(띄어쓰기나 엔터 기준)
		//nextLine() : 입력을 받은 값을 String 타입으로 받아온다(한 줄)
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.printf("%s님 환영합니다\n", name);
		System.out.printf("%s님의 등급은 VIP입니다\n", name);
		System.out.printf("%s님의 나이는 %s살 입니다\n", name, age);
		sc.close();
	}
}
