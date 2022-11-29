package q17동적계획법1_12;
/*
문제
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

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
		int cnt = Integer.parseInt(br.readLine());
		int[] list = new int[cnt], len = new int[cnt];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++) list[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt; i++) {
			len[i] = 1;
			for(int j = 0; j < i; j++) 
				if(list[j] < list[i] && len[i] <= len[j])
					len[i] = len[j] + 1;
		}
		int max = 0;
		for(int i = 0; i < cnt; i++) max = len[i] > max ? len[i] : max;
		System.out.println(max);
	}
}