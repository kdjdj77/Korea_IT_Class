package q22분할정복06;
/*
문제
N*M크기의 행렬 A와 M*K크기의 행렬 B가 주어졌을 때, 두 행렬을 곱하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬 A의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 순서대로 주어진다. 그 다음 줄에는 행렬 B의 크기 M과 K가 주어진다. 이어서 M개의 줄에 행렬 B의 원소 K개가 차례대로 주어진다. N과 M, 그리고 K는 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 곱한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) A[i][j] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine()); st.nextToken();
		int K = Integer.parseInt(st.nextToken());
		int[][] B = new int[M][K];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < K; j++) B[i][j] = Integer.parseInt(st.nextToken());
		}
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < K; y++) {
				int sum = 0;
				for(int i = 0; i < M; i++) sum += A[x][i] * B[i][y];
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}