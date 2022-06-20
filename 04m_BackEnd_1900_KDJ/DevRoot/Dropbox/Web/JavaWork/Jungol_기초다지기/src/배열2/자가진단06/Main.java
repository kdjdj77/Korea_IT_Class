package 배열2.자가진단06;
/*
5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각
 개인별로 평균이 80 이상이면 “pass” 그렇지 않으면 “fail”을
  출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][4];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		int suc = 0;
		for(int i = 0; i < 5; i++) {
			sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += score[i][j];
			}
			if (sum / 4 >= 80) {
				System.out.println("pass");
				suc += 1;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + suc);
		
		sc.close();

	}

}
