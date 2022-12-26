package q03반복문07;
/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, sum;
		int cnt = s.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			a = s.nextInt();
			b = s.nextInt();
			sum = a + b;
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
		}
		s.close();
	}
}
