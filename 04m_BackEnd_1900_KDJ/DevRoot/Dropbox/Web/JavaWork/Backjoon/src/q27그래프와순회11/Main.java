package q27그래프와순회11;
/*
문제
체스판 위에 한 나이트가 놓여져 있다. 나이트가 한 번에 이동할 수 있는 칸은 아래 그림에 나와있다. 나이트가 이동하려고 하는 칸이 주어진다. 나이트는 몇 번 움직이면 이 칸으로 이동할 수 있을까?



입력
입력의 첫째 줄에는 테스트 케이스의 개수가 주어진다.

각 테스트 케이스는 세 줄로 이루어져 있다. 첫째 줄에는 체스판의 한 변의 길이 l(4 ≤ l ≤ 300)이 주어진다. 체스판의 크기는 l × l이다. 체스판의 각 칸은 두 수의 쌍 {0, ..., l-1} × {0, ..., l-1}로 나타낼 수 있다. 둘째 줄과 셋째 줄에는 나이트가 현재 있는 칸, 나이트가 이동하려고 하는 칸이 주어진다.

출력
각 테스트 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력한다.
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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
		while(cnt-- > 0) {
			int I = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
			
			boolean[][] visit = new boolean[I][I];
			Queue<int[]> q = new LinkedList<>();
			int[][] d = {{2,1},{2,-1},{1,2},{1,-2},{-1,2},{-1,-2},{-2,1},{-2,-1}};
			
			visit[x][y] = true;
			q.add(new int[] {x, y, 0});
			while(true) {
				int[] cur = q.poll();
				int a = cur[0], b = cur[1], c = cur[2];
				if (a == x2 && b == y2) { sb.append(c).append("\n"); break; }
				
				for(int i = 0; i < 8; i++) {
					int a2 = a+d[i][0], b2 = b+d[i][1];
					if (visit[a2][b2]) continue;
		            if (a2 >= 0 && b2 >= 0 && a2 < I && b2 < I) {
			            q.add(new int[] {a2, b2, c+1});
			    		visit[a2][b2] = true;
		            }
				}
			}
		}
		System.out.print(sb);
	}
}