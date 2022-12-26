package q17동적계획법1_10;
/*
문제
45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
*/


import java.util.Scanner;
 
public class Main {
	final static long N = 1000000000;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt(); s.close();
		long[][] list = new long[cnt][10];

		for(int i = 1; i < 10; i++) list[0][i] = 1;
		for(int i = 1; i < cnt; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0) list[i][0] = list[i-1][1] % N;
				else if (j == 9) list[i][9] = list[i-1][8] % N;
				else list[i][j] = (list[i-1][j-1] + list[i-1][j+1]) % N;
			}
		}
		long ans = 0;
		for(int i = 0; i < 10; i++) ans += list[cnt - 1][i];
		System.out.println(ans % N);
	}
}