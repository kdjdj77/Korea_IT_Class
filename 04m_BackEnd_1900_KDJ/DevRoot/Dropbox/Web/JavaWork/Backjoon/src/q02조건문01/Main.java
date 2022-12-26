package q02조건문01;
/*
첫째 줄에 다음 세 가지 중 하나를 출력한다.

A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if (a > b) System.out.print(">");
		if (a < b) System.out.print("<");
		if (a == b) System.out.print("==");
		s.close();
	}
}
