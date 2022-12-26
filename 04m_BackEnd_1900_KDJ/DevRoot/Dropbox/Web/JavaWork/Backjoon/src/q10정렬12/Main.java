package q10정렬12;
/*
문제
수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

입력
첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

출력
첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

제한
1 ≤ N ≤ 1,000,000
-109 ≤ Xi ≤ 109
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[] list = new int[cnt], list2 = new int[cnt];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < cnt; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			list2[i] = list[i];
		}
		Arrays.sort(list2);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int zip = 0;
		for(int a : list2) if(!map.containsKey(a)) { map.put(a, zip); zip++; }

		StringBuilder sb = new StringBuilder();
		for(int k : list) sb.append(map.get(k)).append(' ');
		System.out.println(sb);
	}
}