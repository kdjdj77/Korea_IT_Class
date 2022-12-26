package q08기본수학2_04;
/*
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		
		for(int i = min; i <= max; i++)
			if (isPrime(i)) System.out.println(i);
		s.close();
	}
	public static boolean isPrime(int a) {
		if (a == 1) return false;
		for(int i = 2; i <= Math.sqrt(a); i++)
			if (a % i == 0) return false;
		return true;
	}
}