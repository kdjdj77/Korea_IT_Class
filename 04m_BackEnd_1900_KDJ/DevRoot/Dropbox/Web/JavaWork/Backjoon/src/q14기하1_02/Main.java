package q14기하1_02;
/*
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.
*/

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt(), y1 = s.nextInt();
		int x2 = s.nextInt(), y2 = s.nextInt();
		int x3 = s.nextInt(), y3 = s.nextInt();
		
		System.out.print(getOne(x1, x2, x3) + " " + getOne(y1, y2, y3));
		s.close();
	}
	public static int getOne(int a, int b, int c) {
		if (a == b) return c;
		else if (b == c) return a;
		else return b;
	}
}