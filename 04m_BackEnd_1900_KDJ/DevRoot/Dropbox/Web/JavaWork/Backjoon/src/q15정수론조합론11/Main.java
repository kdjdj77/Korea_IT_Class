package q15정수론조합론11;
/*
문제
N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)

출력
첫째 줄에 구한 0의 개수를 출력한다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m5 = 0, k;
        s.close();
        if (n < 5) { System.out.println(0); return; }
        for(int i = 5; i <= n; i += 5) {
        	k = i;
        	while (k % 5 == 0) { k /= 5; m5++; }
        }
        System.out.println(m5);
    }
}