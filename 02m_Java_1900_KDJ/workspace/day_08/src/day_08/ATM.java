package day_08;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {	
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
		String id = "";
		int pw = r.nextInt();
		int money = 0;
		while(true) {
			System.out.println("===ATM=====================");
			System.out.println("1. 계좌 발급");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 : ");
			int ch = sc.nextInt();
			if (ch == 1) {
				for (int i = 0; i < 10; i++) {
					if (i == 2 || i == 6) id += '-';
					id += Integer.toString(r.nextInt(10));
				}
				/*String.format("%02d-%04d-%04d", r.nextInt(100), 
					r.nextInt(10000), r.nextInt(10000));*/
				System.out.println(id);
				System.out.print("비밀번호를 설정하세요 : ");
				pw = sc.nextInt();
				System.out.print("비밀번호를 확인 : ");
				if (sc.nextInt() != pw) {
					System.out.println("잘못 입력하였습니다\n처음부터 다시 시작합니다");
					id = "";
					pw = r.nextInt();
				}
				else System.out.println("계좌 개설 완료");

			}
			else if (ch == 2) {
				sc.nextLine();
				System.out.print("계좌번호 입력 : ");
				if (sc.nextLine().equals(id)) {
					int count = 3;
					while (count != 0) {
						System.out.print("비밀번호 입력 : ");
						if (sc.nextInt() != pw) {
							System.out.println("잘못된 입력\n남은 횟수 " + (count - 1) + "회");
							count--;
						}
						else {
							System.out.print("입금금액 입력 : ");
							money += sc.nextInt();
							break;
						}
					}
				}
				else System.out.println("잘못 입력하였습니다\n처음부터 다시 시작합니다");
			}
			else if (ch == 3) {
				sc.nextLine();
				System.out.print("계좌번호 입력 : ");
				if (sc.nextLine().equals(id)) {
					int count = 3;
					while (count != 0) {
						System.out.print("비밀번호 입력 : ");
						if (sc.nextInt() != pw) {
							System.out.println("잘못된 입력\n남은 횟수 " 
												+ (count - 1) + "회");
							count--;
						}
						else {
							System.out.println("현재 " + money + "원");
							System.out.print("출금금액 입력 : ");
							int temp2 = sc.nextInt();
							if (temp2 <= money)
								money -= temp2;
							else System.out.println("잔액이 부족합니다");
							break;
						}
					}
				}
				else System.out.println("잘못 입력하였습니다\n처음부터 다시 시작합니다");
			}
			else if (ch == 0) {
				System.out.println("종료");
				break;
			}
			else System.out.println("잘못된 입력");
		}
		sc.close();
	}
}
