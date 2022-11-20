package q15정수론조합론03;
/*
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), res1 = 0;
        int c = a > b ? b : a;
        for(int i = c; i > 0; i--) 
			if(a % i == 0 && b % i == 0) { res1 = i; break; }
		System.out.println(res1);
		System.out.println((a * b) / res1);
        s.close();
    }
}