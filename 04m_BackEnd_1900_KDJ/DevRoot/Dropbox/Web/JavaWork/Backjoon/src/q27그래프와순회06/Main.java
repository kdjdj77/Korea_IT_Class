package q27그래프와순회06;

/*
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> A;
    static StringBuilder sb = new StringBuilder();
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        A = new ArrayList<>();
        visit = new boolean[N+1];

        for (int i = 0; i <= N; i++) A.add(new ArrayList<Integer>());

        for (int j = 0; j < M; j++) { //초기 연결하는 두 정점 값 세팅
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            A.get(start).add(end);
            A.get(end).add(start);
        }
        for (int i = 0; i <= N; i++) Collections.sort(A.get(i));

        dfs(V);
        sb.append("\n");
        visit = new boolean[N+1];
        bfs(V);
        System.out.print(sb);
    }
    public static void dfs(int s) {
        sb.append(s).append(" ");
        visit[s] = true;

        for (int i : A.get(s)) {
            if (!visit[i]) dfs(i);
        }
    }
    public static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        sb.append(s).append(" ");

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i : A.get(x)) {
                if (visit[i] == false) {
                    q.add(i);
                    sb.append(i + " ");
                    visit[i] = true;
                }
            }
        }
    }
}