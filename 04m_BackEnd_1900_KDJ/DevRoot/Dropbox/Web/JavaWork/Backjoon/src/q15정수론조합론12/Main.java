package q15정수론조합론12;
/*
문제
 
$n \choose m$의 끝자리 $0$의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 $n$, $m$ ($0 \le m \le n \le 2,000,000,000$, $n \ne 0$)이 들어온다.

출력
첫째 줄에 
$n \choose m$의 끝자리 $0$의 개수를 출력한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong(), K = s.nextLong();
        System.out.println(Math.min(m5(N) - m5(N - K) - m5(K), m2(N) - m2(N - K) - m2(K)));
        s.close();
    }
    public static long m5(long num) {
		int count = 0;
		while(num >= 5) { count += (num / 5); num /= 5; }
		return count;
	}
    public static long m2(long num) {
		int count = 0;
		while(num >= 2) { count += (num / 2); num /= 2; }
		return count;
	}
}