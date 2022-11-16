package q08기본수학2_01;
/*
문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.
 */
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int cnt = 0;
		for(int i = 0; i < num; i++) {
			int a = s.nextInt();
			if (isPrime(a)) cnt++;
		}
		System.out.print(cnt);
		s.close();
	}
	public static boolean isPrime(int a) {
		if (a == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(a); i++)
			if (a % i == 0) return false;
		
		return true;
	}
}