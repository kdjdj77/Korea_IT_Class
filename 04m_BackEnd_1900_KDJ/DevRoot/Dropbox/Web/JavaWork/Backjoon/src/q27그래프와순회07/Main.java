package q27그래프와순회07;
/*
문제
<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고, 단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다. <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.



입력
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.

출력
첫 번째 줄에는 총 단지수를 출력하시오. 그리고 각 단지내 집의 수를 오름차순으로 정렬하여 한 줄에 하나씩 출력하시오.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
 
public class Main {
	static boolean[][] visit;
	static char[][] A;
	static int N, cnt = 0;
	static ArrayList<Integer> res = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		N = Integer.parseInt(br.readLine());
		A = new char[N][N];
		visit = new boolean[N][N];
		for(int i = 0; i < N; i++) {
			String a = br.readLine();
			for(int j = 0; j < N; j++) A[i][j] = a.charAt(j);
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				cnt = 0;
				calc(i, j);
				if (cnt != 0) res.add(cnt);
			}
		}
		sb.append(res.size()).append("\n");
		Collections.sort(res);
		for(int a : res) sb.append(a).append("\n");
		System.out.print(sb);
	}
	public static void calc(int y, int x) {
		if (visit[y][x] || A[y][x] == '0') return;
		visit[y][x] = true;
		cnt++;
		if (y > 0) calc(y-1, x);
		if (x > 0) calc(y, x-1);
		if (y < N-1) calc(y+1, x);
		if (x < N-1) calc(y, x+1);
	}
}