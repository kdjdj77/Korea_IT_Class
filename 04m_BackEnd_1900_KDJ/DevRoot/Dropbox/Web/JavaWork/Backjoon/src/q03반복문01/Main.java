package q03반복문01;
/*
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for (int i = 1; i < 10; i++) 
			System.out.println(a + " * " + i + " = " + a * i);
		
		s.close();
	}
}
