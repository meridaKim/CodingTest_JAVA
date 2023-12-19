package BOJ;

import java.io.*;
import java.util.*;

public class BOJ_1389 {

    // input
    private static BufferedReader br;

    // variables
    private static final int INF = Integer.MAX_VALUE / 4;
    private static int N, M, ans, min;
    private static List<List<Node>> adjList;

    private static class Node implements Comparable<Node> {
        int node;
        int dist;

        public Node(int node, int dist) {
            this.node = node;
            this.dist = dist;
        } // End of Node()

        @Override
        public int compareTo(Node o) {
            return dist = o.dist;
        } // End of compareTo()
    } // End of Node class

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input();

        bw.write(solve());
        bw.close();
    } // End of main()

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            dijkstra(i);
            //1번 사람부터 n번 사람까지 dijkstra 진행한다.
        }

        sb.append(ans);
        return sb.toString();
    } // End of solve()

    private static void dijkstra(int start) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pque = new PriorityQueue<>();
        pque.offer(new Node(start, 0));

        while (!pque.isEmpty()) {
            Node now = pque.poll();

            for (Node next : adjList.get(now.node)) {
                if (dist[next.node] > dist[now.node] + next.dist) {
                    dist[next.node] = dist[now.node] + next.dist;
                    pque.offer(new Node(next.node, dist[next.node]));
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += dist[i];
            //ex) 1번이 2,3,4,5번을 지나는 최단거리들의 총합
        }

        if (min > sum) {
            min = sum;
            ans = start;
            //1번부터 마지막 번호까지 돌면서 min은 가장 작은 총합으로 바뀌고 해당 총합의 번호가 ans이 된다.
        }
    } // End of dijkstra()

    private static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        min = INF;

        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjList.get(a).add(new Node(b, 1));
            adjList.get(b).add(new Node(a, 1));
        }
    } // End of input()
} // End of Main class
