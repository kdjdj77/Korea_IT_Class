package q03반복문06;
/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cnt = s.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= cnt; i++) {
			sum = s.nextInt() + s.nextInt();
			System.out.println("Case #" + i + ": " + sum);
		}
		s.close();
	}
}
