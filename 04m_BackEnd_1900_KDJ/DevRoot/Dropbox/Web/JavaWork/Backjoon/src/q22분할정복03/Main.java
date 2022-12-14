package q22분할정복03;
/*
문제
N×N크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1 중 하나가 저장되어 있다. 우리는 이 행렬을 다음과 같은 규칙에 따라 적절한 크기로 자르려고 한다.

만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
(1)이 아닌 경우에는 종이를 같은 크기의 종이 9개로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
이와 같이 종이를 잘랐을 때, -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 37, N은 3k 꼴)이 주어진다. 다음 N개의 줄에는 N개의 정수로 행렬이 주어진다.

출력
첫째 줄에 -1로만 채워진 종이의 개수를, 둘째 줄에 0으로만 채워진 종이의 개수를, 셋째 줄에 1로만 채워진 종이의 개수를 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	static int[][] S;
	static int a = 0, b = 0, c = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		S = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) S[i][j] = Integer.parseInt(st.nextToken());
		}
		calc(0, 0, N, N);
		sb.append(a).append("\n").append(b).append("\n").append(c);
		System.out.print(sb);
	}
	public static void calc(int x1, int y1, int x2, int y2) {
		int dx = (x2-x1)/3, dy = (y2-y1)/3;
		int chk = isOne(x1, y1, x2, y2);
		if (chk == 2) {
			for(int i = x1; i < x2; i += dx)
				for(int j = y1; j < y2; j += dy) 
					calc(i, j, i+dx, j+dy);
		} else {
			if (chk == -1) a++;
			if (chk == 0) b++;
			if (chk == 1) c++;
		}
	}
	public static int isOne(int x1, int y1, int x2, int y2) {
		int comp = S[x2][y2];
		for(int i = x1+1; i <= x2; i++)
			for(int j = y1+1; j <= y2; j++)
				if (S[i][j] != comp) return 2;
		return comp;
	}
}