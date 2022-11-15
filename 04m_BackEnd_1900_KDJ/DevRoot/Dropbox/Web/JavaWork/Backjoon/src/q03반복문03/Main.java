package q03반복문03;
/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= cnt; i++) sum += i;
		System.out.print(sum);
		s.close();
	}
}
