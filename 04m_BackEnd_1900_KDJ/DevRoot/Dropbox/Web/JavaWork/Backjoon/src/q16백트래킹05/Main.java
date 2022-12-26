package q16백트래킹05;
/*
문제
N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (1 ≤ N < 15)

출력
첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
*/

import java.util.Scanner;

public class Main {
	public static int[] line;
	public static int cnt = 0;

	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		line = new int[N];
		setQueen(0, N);
		System.out.println(cnt);
	}
	public static void setQueen(int y, int N) {
		if (y == N) { cnt++; return; }
		
		for (int i = 0; i < N; i++) {
			line[y] = i;
			if (available(y)) setQueen(y + 1, N);
		}
	}
	public static boolean available(int now) {
		for (int ex = 0; ex < now; ex++) {
			if (line[now] == line[ex]) return false;
			else if (Math.abs(now - ex) == Math.abs(line[now] - line[ex])) return false;
		}
		return true;
	}
}