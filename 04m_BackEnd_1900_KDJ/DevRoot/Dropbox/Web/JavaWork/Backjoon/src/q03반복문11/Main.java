package q03반복문11;
/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) System.out.println(s.nextInt() + s.nextInt());
	}
}
