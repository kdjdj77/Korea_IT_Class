package day_06;
import java.util.Scanner;

public class SwitchTask 
{
	public static void main(String[] args) 
	{
		//월을 입력받아 해당 월의 마지막 일 출력
		//2월은 28까지로 가정
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		int day = 0;
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31; break;
		case 4: case 6: case 9: case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		}
		if (day != 0)
			System.out.println(month + "월은 " + day + "일이 마지막입니다");
		else
			System.out.println("잘못된 입력");
		
		//3. 90이상 A, 80~90 B, 70~80 C, 70이하 F
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		switch(score / 10)
		{
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
		sc.close();
	}
}