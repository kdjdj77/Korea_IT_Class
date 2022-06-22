package 문자열1.자가진단4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = sc.nextInt();
		int index;
		
		for(int i = 0; i < num; i++) {
			index = str.length() - 1 - i;
			if(index < 0) break;
			System.out.print(str.charAt(index));
		}
		
		
		sc.close();

	}

}
