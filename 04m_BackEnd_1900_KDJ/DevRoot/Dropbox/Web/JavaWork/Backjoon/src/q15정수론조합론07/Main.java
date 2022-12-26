package q15정수론조합론07;
/*
문제
자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수 
\(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 \(N\)과 \(K\)가 주어진다. (1 ≤ \(N\) ≤ 10, 0 ≤ \(K\) ≤ \(N\))

출력
 
\(\binom{N}{K}\)를 출력한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), K = s.nextInt();
        if (K > N / 2) K = N - K;
        System.out.print(fact(N) / fact(K) / fact(N - K));
        s.close();
    }
    public static int fact(int a) {
    	int res = 1;
    	if (a == 0) return 1;
    	for(int i = 1; i <= a; i++) res *= i;
    	return res;
    }
}