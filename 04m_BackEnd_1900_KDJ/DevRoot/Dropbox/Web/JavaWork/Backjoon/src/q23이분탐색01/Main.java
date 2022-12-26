package q23이분탐색01;
/*
문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(A);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int k = Integer.parseInt(st.nextToken());
			sb.append(isEx(A, k, 0, N-1)).append("\n");
		}
		System.out.print(sb);
	}
	public static int isEx(int[] A, int k, int s, int e) {
		if (s > e) return 0;
		
		int m = (s + e) / 2;
		if (A[m] > k) return isEx(A, k, s, m - 1);
		else if (A[m] < k) return isEx(A, k, m + 1, e);
		else return 1;
	}
}