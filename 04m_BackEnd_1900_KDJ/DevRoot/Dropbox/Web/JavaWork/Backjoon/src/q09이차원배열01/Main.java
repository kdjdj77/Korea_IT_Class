package q09이차원배열01;
/*
문제
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

입력
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 */
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[][] list1 = new int[M][N];
		int[][] list2 = new int[M][N];
		
		for(int i = 0; i < M; i++) for(int j = 0; j < N; j++) list1[i][j] = s.nextInt();
		for(int i = 0; i < M; i++) for(int j = 0; j < N; j++) list2[i][j] = s.nextInt();
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if (j != N-1) System.out.print(list1[i][j] + list2[i][j] + " ");
				else System.out.print(list1[i][j] + list2[i][j]);
			}
			System.out.println();
		}
		s.close();
	}
}