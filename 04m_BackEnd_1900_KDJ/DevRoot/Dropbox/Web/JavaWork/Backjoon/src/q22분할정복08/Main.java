package q22분할정복08;
/*
문제
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 n번째 피보나치 수를 1,000,000,007으로 나눈 나머지를 출력한다.
*/

import java.util.Scanner;
 
public class Main {
	static long[][] A = {{1, 1},{1, 0}};
	static long D = 1000000007;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		System.out.print(calc(N)[0][1]);
	}
	public static long[][] calc(long N) {
		if (N == 1) return A;
		long[][] tmp = calc(N/2);
		if (N % 2 == 0) return mult(tmp, tmp);
		else return mult(mult(tmp, tmp), A);
	}
	public static long[][] mult(long[][] a, long[][] b) {
		long[][] r = new long[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                for(int k = 0; k < 2; k++) r[i][j] += (a[i][k] * b[k][j]) % D;
                r[i][j] %= D;
            }
        }
        return r;
    }
}