package q27그래프와순회09;
/*
문제
N×M크기의 배열로 표현되는 미로가 있다.

1	0	1	1	1	1
1	0	1	0	1	0
1	0	1	0	1	1
1	1	1	0	1	1
미로에서 1은 이동할 수 있는 칸을 나타내고, 0은 이동할 수 없는 칸을 나타낸다. 이러한 미로가 주어졌을 때, (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소의 칸 수를 구하는 프로그램을 작성하시오. 한 칸에서 다른 칸으로 이동할 때, 서로 인접한 칸으로만 이동할 수 있다.

위의 예에서는 15칸을 지나야 (N, M)의 위치로 이동할 수 있다. 칸을 셀 때에는 시작 위치와 도착 위치도 포함한다.

입력
첫째 줄에 두 정수 N, M(2 ≤ N, M ≤ 100)이 주어진다. 다음 N개의 줄에는 M개의 정수로 미로가 주어진다. 각각의 수들은 붙어서 입력으로 주어진다.

출력
첫째 줄에 지나야 하는 최소의 칸 수를 출력한다. 항상 도착위치로 이동할 수 있는 경우만 입력으로 주어진다.
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
		
		int[][] A = new int[N][M];
		boolean[][] visit = new boolean[N][M];
		Queue<int[]> q = new LinkedList<>();
		int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};
		
		for(int i = 0; i < N; i++) {
			String a = br.readLine();
			for(int j = 0; j < M; j++) A[i][j] = a.charAt(j) - 48;
		}
		visit[0][0] = true;
		q.add(new int[] {0, 0});	
		while(!q.isEmpty()) {
			int[] cur = q.poll();
			int x = cur[0], y = cur[1];
			
			for(int i = 0; i < 4; i++) {
				int x2 = x + d[i][0], y2 = y + d[i][1];
				
                if (x2 < 0 || y2 < 0 || x2 >= N || y2 >= M) continue;
		        if (visit[x2][y2] || A[x2][y2] == 0) continue;
            
                q.add(new int[] {x2, y2});
		        A[x2][y2] = A[x][y] + 1;
        		visit[x2][y2] = true;
			}
		}
		System.out.print(A[N-1][M-1]);
	}
}