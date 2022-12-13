package q18누적합단계06;
/*
문제
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 K×K 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 K×K 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 K×K 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N, M, K가 주어진다. 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

출력
첫째 줄에 지민이가 잘라낸 K×K 보드를 체스판으로 만들기 위해 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.

제한
1 ≤ N, M ≤ 2000
1 ≤ K ≤ min(N, M)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] ws = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			for(int j = 1; j <= M; j++) {
				ws[i][j] = ws[i-1][j] + ws[i][j-1] - ws[i-1][j-1];
				char c = str.charAt(j-1);
				if ((i - j) % 2 == 0 && c == 'B') ws[i][j]++;
				if ((i - j) % 2 != 0 && c != 'B') ws[i][j]++;
			}
		}
		int max = 0, min = Integer.MAX_VALUE;
		for(int i = 1; i <= N-K+1; i++) {
			for(int j = 1; j <= M-K+1; j++) {
				int res = ws[i+K-1][j+K-1] - ws[i-1][j+K-1] - ws[i+K-1][j-1] + ws[i-1][j-1];
				if (res < min) min = res;
				if (res > max) max = res;
			}
		}
		System.out.print(Math.min(K*K-max, min));
	}
}