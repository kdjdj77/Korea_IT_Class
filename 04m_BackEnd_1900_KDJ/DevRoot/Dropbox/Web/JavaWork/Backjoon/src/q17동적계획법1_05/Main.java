package q17동적계획법1_05;
/*
문제
n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.

예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.

입력
첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

출력
첫째 줄에 답을 출력한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] list = new int[cnt];
		int[] maxList = new int[cnt];	
		
		for(int i = 0; i < cnt; i++) list[i] = Integer.parseInt(st.nextToken());

		int max = maxList[0] = list[0];
		
		for (int i = 1; i < cnt; i++) {
			maxList[i] = Math.max(maxList[i - 1] + list[i], list[i]);
			max = Math.max(max, maxList[i]);
		}
		System.out.println(max);
 
	}
}