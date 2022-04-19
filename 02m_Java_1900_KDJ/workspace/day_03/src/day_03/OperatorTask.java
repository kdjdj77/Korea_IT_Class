package day_03;
import java.util.Scanner;

public class OperatorTask 
{
	public static void main(String[] args) 
	{
		//1. 사용자에게 두 자리수 정수를 입력 받고 십의 자리와 일의 자리를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int input01 = sc.nextInt();
		System.out.printf("십의 자리 : %d\n", input01 / 10);
		System.out.printf("일의 자리 : %d\n", input01 % 10);
		
		//2. 코인노래방 프로그램, 사용자에게 금액을 입력 받고, (한 곡당 300원)
		//부를 수 있는 노래 곡수와 잔돈을 출력하기
	}

}
