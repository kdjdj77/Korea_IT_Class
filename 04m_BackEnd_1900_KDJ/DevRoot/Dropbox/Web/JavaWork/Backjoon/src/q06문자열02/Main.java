package q06문자열02;
/*
문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.nextLine();
		String num = s.nextLine();
		String[] list = num.split("");
		int sum = 0;
		
		for(String a : list) sum += Integer.parseInt(a);	
		
		System.out.print(sum);
		
		s.close();
	}
}
