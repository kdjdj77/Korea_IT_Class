package q27그래프와순회15;
/*
문제
N×M의 행렬로 표현되는 맵이 있다. 맵에서 0은 이동할 수 있는 곳을 나타내고, 1은 이동할 수 없는 벽이 있는 곳을 나타낸다. 당신은 (1, 1)에서 (N, M)의 위치까지 이동하려 하는데, 이때 최단 경로로 이동하려 한다. 최단경로는 맵에서 가장 적은 개수의 칸을 지나는 경로를 말하는데, 이때 시작하는 칸과 끝나는 칸도 포함해서 센다.

만약에 이동하는 도중에 한 개의 벽을 부수고 이동하는 것이 좀 더 경로가 짧아진다면, 벽을 한 개 까지 부수고 이동하여도 된다.

한 칸에서 이동할 수 있는 칸은 상하좌우로 인접한 칸이다.

맵이 주어졌을 때, 최단 경로를 구해 내는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 1,000), M(1 ≤ M ≤ 1,000)이 주어진다. 다음 N개의 줄에 M개의 숫자로 맵이 주어진다. (1, 1)과 (N, M)은 항상 0이라고 가정하자.

출력
첫째 줄에 최단 거리를 출력한다. 불가능할 때는 -1을 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {
	static class P {
		int x, y, c;
		boolean b;
		public P(int x, int y, int c, boolean b) {
			this.x = x; this.y = y; this.c = c; this.b = b;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] A = new char[N][M];
		boolean[][][] visit = new boolean[N][M][2];
		for(int i = 0; i < N; i++) A[i] = br.readLine().toCharArray();
		
		Queue<P> q = new LinkedList<>();
		q.add(new P(0, 0, 1, true));
		visit[0][0][0] = true;
		short[][] d = {{1,0},{-1,0},{0,1},{0,-1}};
		while(!q.isEmpty()) {
			P cur = q.poll();
			if (cur.x == N-1 && cur.y == M-1) { System.out.print(cur.c); return; }
			for(int i = 0; i < 4; i++) {
				int x2 = cur.x + d[i][0], y2 = cur.y + d[i][1];
				if (x2 < 0 || y2 < 0 || x2 >= N || y2 >= M) continue;
				if(A[x2][y2] =='0') {
                    if (cur.b && !visit[x2][y2][0]) {
                        q.add(new P(x2, y2, cur.c+1, true));
                        visit[x2][y2][0] = true;
                    } else if (!cur.b && !visit[x2][y2][1]){
                        q.add(new P(x2, y2, cur.c+1, false));
                        visit[x2][y2][1] = true;
                    }
                } else {
                    if(cur.b){
                        q.add(new P(x2, y2, cur.c+1, false));
                        visit[x2][y2][1] = true;
                    }
                }
			}
		}
		System.out.print(-1);
	}
}