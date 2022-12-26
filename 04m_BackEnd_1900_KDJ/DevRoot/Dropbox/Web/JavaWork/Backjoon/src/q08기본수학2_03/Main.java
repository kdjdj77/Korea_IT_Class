package q08기본수학2_03;
/*
문제
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		List<Integer> list = new ArrayList<>();
		
		if (num == 1) return;
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				list.add(i);
				num /= i;
				i = 1;
			}
		}
		list.add(num);
		for(Integer a : list) System.out.println(a);
	}
}