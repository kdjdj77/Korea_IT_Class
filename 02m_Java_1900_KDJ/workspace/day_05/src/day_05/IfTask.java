package day_05;
import java.util.Scanner;
public class IfTask 
{
	public static void main(String[] args) 
	{
	//정수 입력받아 3의 배수이면 3의 배수 4의 배수이면 4의 배수 출력
		Scanner sc = new Scanner(System.in);
/*		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if (num % 3 == 0) System.out.println("3의 배수입니다");
		if (num % 4 == 0) System.out.println("4의 배수입니다");
*/		
	//1. target에 들어있는 변수가 소문자라면 대문자로, 반대도 동일, 
	//그 외이면 그대로 출력
		char target = 'D';
		if (target >= 65 && target <= 90 )
			System.out.printf("%c\n", target + 32);
		else if (target >= 97 && target <= 122 )
			System.out.printf("%c\n", target - 32);
		else System.out.println(target);
	//년도 입력받아 윤년인지 아닌지 출력
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 400 == 0) System.out.println("윤년");
		else if (year % 4 == 0 && year % 100 == 0) System.out.println("평년");
		else System.out.println("윤년");
	//2. 90이상 A, 80~90 B, 70~80 C, 70이하 F
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
