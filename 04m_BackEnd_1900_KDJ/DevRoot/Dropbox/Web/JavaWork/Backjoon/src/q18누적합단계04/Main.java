package q18누적합단계04;
/*
문제
수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

입력
첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)

둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)

출력
첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        long res = 0;
        long[] list = new long[cnt + 1], cntList = new long[num];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < cnt + 1; i++) {
            list[i] = (list[i - 1] + Integer.parseInt(st.nextToken())) % num;
            if(list[i] == 0) res++;
            cntList[(int)list[i]]++;
        }
        for(int i = 0; i < num; i++)
            if(cntList[i] > 1)
                res += (cntList[i] * (cntList[i] - 1) / 2);
        System.out.println(res);
    }
}