package q13집합과맵07;
/*
문제
문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.

부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.

예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

입력
첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.

출력
첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        HashSet<String> set = new HashSet<>();
        
        int len = text.length();
        for(int i = 1; i <= len; i++)
        	for(int j = 0; j <= len - i; j++)
        		set.add(text.substring(j, j + i));
        System.out.println(set.size());
	}
}