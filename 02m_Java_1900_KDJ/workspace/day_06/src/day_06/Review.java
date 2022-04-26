package day_06;
import java.util.Scanner;
public class Review 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	//1. target에 들어있는 변수가 소문자라면 대문자로, 대문자라면 소문자로
	//그 외이면 그대로 출력
		char target = 'A';
		if (target >= 'A' && target <= 'Z' ) target += 32;
		else if (target >= 'a' && target <= 'z' ) target -= 32;
		System.out.println(target);
		
	//2. 년도 입력받아 윤년인지 아닌지 출력
		int year = sc.nextInt();
		if (year % 400 == 0) System.out.println("윤년");
		else if (year % 100 == 0) System.out.println("평년");
		else if (year % 4 == 0) System.out.println("윤년");
		else System.out.println("평년");
		
	//3. 90이상 A, 80~90 B, 70~80 C, 70이하 F
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		System.out.print("당신의 학점은 ");
		if (score >= 90) System.out.print('A');
		else if (score < 90 && score >= 80) System.out.print('B');
		else if (score < 80 && score >= 70) System.out.print('C');
		else System.out.print('F');
		System.out.println("입니다");
		sc.close();
	}
}