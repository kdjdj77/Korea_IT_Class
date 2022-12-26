package q07기본수학1_08;
/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)

출력
첫째 줄에 A+B를 출력한다.
 */
import java.util.Scanner;
import java.math.BigInteger;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		BigInteger A = new BigInteger(s.next());
		BigInteger B = new BigInteger(s.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
		s.close();
	}
}