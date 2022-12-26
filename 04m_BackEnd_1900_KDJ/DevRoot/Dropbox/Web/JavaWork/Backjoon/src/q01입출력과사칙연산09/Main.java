package q01입출력과사칙연산09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] list = {1,1,2,2,2,8};
		
		list[0] -= s.nextInt();
		System.out.print(list[0]);
		
		for(int i = 1; i < list.length; i++) {
			list[i] -= s.nextInt();
			System.out.print(" " + list[i]);
		}
	}
}
