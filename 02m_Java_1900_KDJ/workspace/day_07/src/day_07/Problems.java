package day_07;
import java.util.Scanner;
import java.util.Random;

public class Problems 
{
	public static void main(String[] args) 
	{	
	/*ATM 프로그램
	1. 계좌 발급받기
		비밀번호 설정하기(4자리)
		비밀번호 확인(계좌개설 완료)
		계좌 발급
	2. 입금하기
		계좌번호 입력
		비밀번호 입력(횟수제한 3회)
		입금금액 입력
	3. 출금하기
		계좌번호 입력
		비밀번호 입력(횟수제한 3회)
		출금금액 입력
		잔액확인 후 출금
	*/
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String id;
		int pw;
		while(true)
		{
			System.out.println("===========================");
			System.out.println("1. 계좌 발급");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("0. ");
			System.out.print("번호를 선택하세요 : ");
			int ch = sc.nextInt();
			if (ch == 1) 
			{
				id = "00-0000-0000";
				System.out.print("비밀번호를 설정하세요 : ");
				pw = sc.nextInt();
				System.out.print("비밀번호를 확인 : ");
				if (sc.nextInt() != pw) 
					System.out.println("잘못 입력하였습니다");
			}
			if (ch == 2) 
			{
				
			}
			if (ch == 3) 
			{
				
			}
			if (ch == 0) 
			{
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		sc.close();
	}
}