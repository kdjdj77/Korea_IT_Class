package q04일차원배열09;
/*
문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = Integer.parseInt(s.nextLine());
		
		String[] list = new String[cnt];
		for(int i = 0; i < cnt; i++) list[i] = s.nextLine();
		
		for(String a : list) {
			String[] scores = a.split(" ");
			String num = scores[0];
			int len = scores.length, sum = 0, p = 0;
			Double avg;
			
			for(int i = 1; i < len; i++) sum += Integer.parseInt(scores[i]);
			
			avg = sum / Double.parseDouble(num);
			
			for(int i = 1; i < len; i++) if(Integer.parseInt(scores[i]) > avg) p++;
			
			System.out.printf("%.3f%%\n", p * 100 / Double.parseDouble(num));
		}
		
		s.close();
	}
}
