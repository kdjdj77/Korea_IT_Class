package q05함수03;
/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int cnt = 0;
		for(int i = 1; i <= input; i++) if (han(i)) cnt++;
		
		System.out.print(cnt);
		
		s.close();
	}
	
	public static boolean han(int a) {
		boolean result = true;
		int cnt = 0, test = a;
		while(test != 0) { test = test / 10; cnt++; }
		int[] list = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			list[i] = a % 10;
			a = a / 10;
		}
		
		if (cnt > 2) {
			int tol = list[1] - list[0];
			for(int i = 0; i < cnt - 1; i++)
				if (list[i + 1] - list[i] != tol) result = false;
		}
		
		return result;
	}
}
