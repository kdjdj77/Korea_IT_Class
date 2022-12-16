package q22분할정복07;
/*
문제
크기가 N*N인 행렬 A가 주어진다. 이때, A의 B제곱을 구하는 프로그램을 작성하시오. 수가 매우 커질 수 있으니, A^B의 각 원소를 1,000으로 나눈 나머지를 출력한다.

입력
첫째 줄에 행렬의 크기 N과 B가 주어진다. (2 ≤ N ≤  5, 1 ≤ B ≤ 100,000,000,000)

둘째 줄부터 N개의 줄에 행렬의 각 원소가 주어진다. 행렬의 각 원소는 1,000보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄부터 N개의 줄에 걸쳐 행렬 A를 B제곱한 결과를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	static long[][] A;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		A = new long[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) A[i][j] = Long.parseLong(st.nextToken()) % 1000;
		}
		long[][] res = calc(B);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) sb.append(res[i][j]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
	public static long[][] calc(long B) {
		if (B == 1) return A;
		long[][] tmp = calc(B/2);
		if (B % 2 == 0) return mult(tmp, tmp);
		else return mult(mult(tmp, tmp), A);
	}
	public static long[][] mult(long[][] a, long[][] b) {
		long[][] re = new long[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				long sum = 0;
				for(int k = 0; k < N; k++) sum += (a[i][k] * b[k][j]) % 1000;
				re[i][j] = sum % 1000;
			}
		}
		return re;		
	}
}