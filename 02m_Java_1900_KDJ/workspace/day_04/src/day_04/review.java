package day_04;
import java.util.Scanner;

public class review {
	public static void main(String[] args)
	{
	//1. 사용자에게 두 자리수 정수를 입력 받고 십의 자리와 일의 자리를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
/*		System.out.print("두 자리 정수를 입력 : ");
		int num = sc.nextInt();
		System.out.println("십의 자리\t: " + (num / 10));
		System.out.println("일의 자리\t: " + (num % 10));
*/		
	//2. 코인노래방 프로그램, 사용자에게 금액을 입력 받고, (한 곡당 300원)
	//부를 수 있는 노래 곡수와 잔돈을 출력하기
/*		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();
		final int price = 300;	//final : 변수를 상수처럼 취급
		System.out.printf("노래 곡 수\t: %d\n", money / price);
		System.out.printf("잔돈\t: %d원\n", money % price);
*/		
	//3. 사용자에게 국어, 수학, 영어점수를 입력(정수로)받아서 평균을 구하여라
		System.out.print("국어 점수 입력 : ");
		int a = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int b = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int c = sc.nextInt();
		
		//System.out.println("평균은 " + ((a + b + c)/3.) + "입니다");
		System.out.printf("평균은 %.2f 입니다", (a + b + c)/3.);
		sc.close();
	}
}
