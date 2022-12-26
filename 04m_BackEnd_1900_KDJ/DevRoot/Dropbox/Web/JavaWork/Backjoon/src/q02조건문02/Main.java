package q02조건문02;
/*
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
나머지 점수는 F를 출력하는 프로그램을 작성하시오
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		switch(a / 10) {
			case 10:
			case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			case 6:
				System.out.print("D");
				break;
			default:
				System.out.print("F");
		}
		s.close();
	}
}
