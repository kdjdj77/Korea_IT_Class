package q06문자열05;
/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String test = s.nextLine().toUpperCase();
		int len = test.length();
		int[] list = new int[26];
		
		for(int i = 0; i < len; i++) list[(int)test.charAt(i) - 65] += 1;
		int max = list[0];
		char maxChar = 65;
		boolean flag = false;
		for(int i = 1; i < 26; i++) {
			if(list[i] > max) { 
				max = list[i]; 
				flag = false; 
				maxChar = (char)(i + 65); 
			}
			else if (list[i] == max) flag = true;
		}
		if (flag) System.out.print("?");
		else System.out.print(maxChar);
		
		s.close();
	}
}
