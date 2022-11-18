package q11재귀함수01;
/*
문제
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

출력
첫째 줄에 N!을 출력한다.
 */
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (num == 0) System.out.print(1);
		else System.out.print(fact(num));
		s.close();
	}
	public static int fact(int num) {
		if (num <= 1) return num;
		else return fact(num - 1) * num;
	}
}