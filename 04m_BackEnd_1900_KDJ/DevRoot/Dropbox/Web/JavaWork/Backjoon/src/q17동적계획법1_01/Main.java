package q17동적계획법1_01;
/*
문제
오늘도 서준이는 동적 프로그래밍 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.

오늘은 n의 피보나치 수를 재귀호출과 동적 프로그래밍으로 구하는 알고리즘을 배웠다. 재귀호출에 비해 동적 프로그래밍이 얼마나 빠른지 확인해 보자. 아래 의사 코드를 이용하여 n의 피보나치 수를 구할 경우 코드1 코드2 실행 횟수를 출력하자.

피보나치 수 재귀호출 의사 코드는 다음과 같다.

fib(n) {
    if (n = 1 or n = 2)
    then return 1;  # 코드1
    else return (fib(n - 1) + fib(n - 2));
}
피보나치 수 동적 프로그래밍 의사 코드는 다음과 같다.

fibonacci(n) {
    f[1] <- f[2] <- 1;
    for i <- 3 to n
        f[i] <- f[i - 1] + f[i - 2];  # 코드2
    return f[n];
}
입력
첫째 줄에 n(5 ≤ n ≤ 40)이 주어진다.

출력
코드1 코드2 실행 횟수를 한 줄에 출력한다.
*/

import java.util.Scanner;

public class Main {
	public static int[] list = new int[41];
	public static int cnt1 = 1;
	public static int cnt2 = 1;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); s.close();
		fib(num);
		fibonacci(num);
		System.out.println(cnt1 + " " + cnt2);
	}
	
	public static int fib(int n) {
	    if (n == 1 || n == 2) return 1;  // 코드1
	    else {
	    	cnt1++;
	    	return (fib(n - 1) + fib(n - 2));
	    }
	}
	
	public static int fibonacci(int n) {
	    list[1] = list[2] = 1;
	    for (int i = 3; i < n; i++) {
	    	cnt2++;
	    	list[i] = list[i - 1] + list[i - 2];  // 코드2
	    }
	    return list[n];
	}
}