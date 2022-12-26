package q18누적합단계01;
/*
문제
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

출력
총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

제한
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] list = new int[num + 1], list2 = new int[num + 1];
		for(int i = 1; i <= num; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			list2[i] = list2[i - 1] + list[i];
		}
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			sb.append((list2[end] - list2[start - 1]) + "\n");
		}
		System.out.println(sb);
	}
}