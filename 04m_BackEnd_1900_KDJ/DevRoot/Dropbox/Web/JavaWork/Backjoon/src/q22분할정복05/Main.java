package q22분할정복05;
/*
문제
자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수 
\(\binom{N}{K}\)를 1,000,000,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤ \(N\) ≤ 4,000,000, 0 ≤ \(K\) ≤ \(N\))

출력
 
\(\binom{N}{K}\)를 1,000,000,007로 나눈 나머지를 출력한다.
*/

import java.util.Scanner;
 
public class Main {
	final static long t = 1000000007;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		long K = s.nextLong();
		System.out.print(f(N) * p(f(K) * f(N - K) % t, t - 2) % t);
	}
	public static long f(long N) {
		long r = 1L;
		while(N > 1) r = (r * N--) % t;
		return r;
	}
	public static long p(long a, long n) {
		if(n == 1) return a % t;
		long d = p(a, n / 2);
		if(n % 2 == 1) return (d * d % t) * a % t;
		return d * d % t;
	}
}