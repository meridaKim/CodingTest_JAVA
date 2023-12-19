package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 촌수 계산
 * */
public class BOJ_2644 {
    static int n, p1, p2;
    static int edge;
    static int [][] graph;
    static int [] visited;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        p1 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(br.readLine());
        graph = new int [n+1][n+1];
        for(int i =0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int t1 = Integer.parseInt(st.nextToken());
            int t2 = Integer.parseInt(st.nextToken());
            graph[t1][t2] = graph[t2][t1] =1;
        }
        visited = new int[n+1];
        dfs(p1);
        int result = visited[p2]==0 ? -1 : visited[p2];
        System.out.println(result);
    }
    public static void dfs(int p1){
        if(p1==p2) return;
        for(int i =1; i<n+1; i++){
            if(visited[i]==0&&graph[p1][i]==1){
                visited[i] = visited[p1]+1;
                dfs(i);
            }
        }
    }
}
