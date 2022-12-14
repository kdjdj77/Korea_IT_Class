package q21큐덱06;
/*
문제
정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여덟 가지이다.

push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static int[] q;
	public static int s = 0, e = 0, cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		cnt = Integer.parseInt(br.readLine()) + 1;
		q = new int[cnt];
		
		for(int i = 0; i < cnt - 1; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "push_back": push_back(Integer.parseInt(st.nextToken())); break;
				case "push_front": push_front(Integer.parseInt(st.nextToken())); break;
				case "pop_back": sb.append(pop_back()).append('\n'); e = calc(e); break;
				case "pop_front": sb.append(pop_front()).append('\n'); s = calc(s); break;
				case "size": sb.append(size()).append('\n'); break;
				case "empty": sb.append(empty()).append('\n'); break;
				case "back": sb.append(back()).append('\n'); break;
				case "front": sb.append(front()).append('\n'); break;
			}
		}
		System.out.print(sb);
	}
	public static void push_back(int i) { q[e++] = i; e = calc(e); }
	public static void push_front(int i) { q[calc(--s)] = i; s = calc(s); }
	public static int size() { return e >= s ? e - s : e + cnt - s; }
	public static int empty() { return e == s ? 1 : 0; }
	public static int back() { return e == s ? -1 : q[calc(e - 1)]; }
	public static int front() { return e == s ? -1 : q[s]; }
	public static int pop_front() { return e == s ? -1 : q[s++]; }
	public static int pop_back() { return e == s ? -1 : q[calc(--e)]; }
	
	public static int calc(int a) {
		if (a >= cnt) return a - cnt;
		if(a < 0) return cnt + a;
		return a;
	}
}