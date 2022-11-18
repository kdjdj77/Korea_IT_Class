package q12브루트포스04;
/*
문제
지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.

출력
첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y = s.nextInt(), x = s.nextInt();
		int min = 99, temp = 99;
		int[][] list = new int[y][x];
		
		for (int i = 0; i < y; i++) {
			String str = s.next();
			for (int j = 0; j < x; j++) 
				list[i][j] = str.charAt(j) == 'W' ? 1 : -1;
		} s.close();

		int x1 = x - 7, y1 = y - 7;
		for (int i = 0; i < y1; i++)
			for (int j = 0; j < x1; j++) {
				temp = minCount(i, j, list);
				if (min > temp) min = temp;				
			}
		System.out.println(min);
	}

	public static int minCount(int y1, int x1, int[][] list) {
		int y2 = y1 + 8, x2 = x1 + 8, cnt = 0;
		int firstColor = list[y1][x1];

		for (int i = y1; i < y2; i++) {
			for (int j = x1; j < x2; j++) {
				if (list[i][j] + firstColor == 0) cnt++;
				firstColor *= -1;
			} firstColor *= -1;
		}
		if (cnt > 64 - cnt) cnt = 64 - cnt;
		return cnt;
	}
}