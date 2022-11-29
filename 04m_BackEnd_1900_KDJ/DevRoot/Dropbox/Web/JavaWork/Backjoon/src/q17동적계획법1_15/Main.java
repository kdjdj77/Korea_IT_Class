package q17동적계획법1_15;
/*
문제
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.

입력
첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.

출력
첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list1 = br.readLine(), list2 = br.readLine();
		int len1 = list1.length(), len2 = list2.length();
		
		int[][] lcs = new int[len1+1][len2+1];
		for(int i = 0; i < len1; i++) {
			for(int j = 0; j < len2; j++) {
				if(list1.charAt(i) == list2.charAt(j))
					lcs[i+1][j+1] = lcs[i][j] + 1;	 
				else 
					lcs[i+1][j+1] = Math.max(lcs[i][j+1], lcs[i+1][j]);
			}
		}
		System.out.println(lcs[len1][len2]);
	}
}