package q01입출력과사칙연산05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.print((double)a / b);
		s.close();
	}
}
