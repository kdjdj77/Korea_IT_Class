package q27그래프와순회10;
/*
문제
수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고, 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다. 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다. 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.

수빈이와 동생의 위치가 주어졌을 때, 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.

입력
첫 번째 줄에 수빈이가 있는 위치 N과 동생이 있는 위치 K가 주어진다. N과 K는 정수이다.

출력
수빈이가 동생을 찾는 가장 빠른 시간을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = 100001;
		
		boolean[] visit = new boolean[L];
		visit[N] = true;
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {N, 0});
		
		while(true) {
			int[] cur = q.poll();
			int x = cur[0], c = cur[1];
			if (x == M) { System.out.print(c); return; }
			
			int x1 = x+1, x2 = x-1, x3 = x*2;
            if (x1 < L && !visit[x1]) { q.add(new int[] {x1,c+1}); visit[x1] = true; }
            if (x2 >= 0 && !visit[x2]) { q.add(new int[] {x2,c+1}); visit[x2] = true; }
            if (x3 < L && !visit[x3]) { q.add(new int[] {x3,c+1}); visit[x3] = true; }
		}
	}
}