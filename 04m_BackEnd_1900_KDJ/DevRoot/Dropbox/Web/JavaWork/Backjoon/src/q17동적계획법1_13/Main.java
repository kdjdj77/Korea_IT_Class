package q17동적계획법1_13;
/*
문제
수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.

예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.

수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.
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
		int[] list = new int[cnt], len1 = new int[cnt], len2 = new int[cnt];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++) list[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt; i++) {
			len1[i] = 1;
			for(int j = 0; j < i; j++) 
				if(list[j] < list[i] && len1[i] <= len1[j])
					len1[i] = len1[j] + 1;
		}
		for(int i = cnt-1; i >= 0; i--) {
			len2[i] = 1;
			for(int j = cnt - 1; j > i; j--) 
				if(list[j] < list[i] && len2[i] <= len2[j])
					len2[i] = len2[j] + 1;
		}
		int max = 0;
		for(int i = 0; i < cnt; i++) max = len1[i]+len2[i] > max ? len1[i]+len2[i] : max;
		System.out.println(max - 1);
	}
}