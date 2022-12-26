package q23이분탐색07;
/*
문제
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000,000)

출력
첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N], B = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
 
		B[0] = A[0];
		int len = 1;
		for (int i = 1; i < N; i++) {
			int x = A[i];
			if (B[len-1] < x) B[++len-1] = x;
			else {
				int s = 0, e = len, m;
				while (s < e) {
					m = (s+e)/2;
					if (B[m] < x) s = m + 1;
					else e = m;
				}
				B[s] = x;
			}
		}
		System.out.print(len);
	}
}