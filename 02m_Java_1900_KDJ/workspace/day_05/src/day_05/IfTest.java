package day_05;
import java.util.Scanner;

public class IfTest 
{
	public static void main(String[] args) 
	{
		System.out.println("안녕");
		System.out.println("반가워");
		if (true)
		{
			System.out.println("if문 안쪽 문장1");
			System.out.println("if문 안쪽 문장2");
			System.out.println("if문 안쪽 문장3");
		}
		System.out.println("if문 바깥쪽 문장");
		
	//사용자에게 정수 입력 받아 짝수면 짝수입니다 홀수이면 홀수입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
	//if-else문
		if (num % 2 == 0) System.out.println("짝수입니다");
		else System.out.println("홀수입니다");
	//삼항연산자
		System.out.println( num % 2 == 0 ? "짝수입니다" : "홀수입니다");
		
	//upgrade. 두 정수 입력받아 큰 수 출력 ( 같으면 같다고 출력 )
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		if (num1 == num2) System.out.println("같다");
		else if (num1 > num2) System.out.println("큰 수 : " + num1);
		else System.out.println("큰 수 : " + num2);
		sc.close();
	}
}