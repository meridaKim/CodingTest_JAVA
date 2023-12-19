package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2606 {
    static int n;
    static int e;
    static int [][] graph;
    static boolean [] visited;
    static int count = 0;
    static StringTokenizer st;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[start][end]=graph[end][start]=1;
        }
        visited = new boolean[n+1];
        dfs(graph,visited,1);
        System.out.println(count-1);
    }
    public static void dfs(int graph[][], boolean [] visited, int v){
        if(visited[v]) return;

        visited[v]=true;
        count++;
        for(int i =0; i<graph[v].length; i++){
            if(!visited[i]&&graph[v][i]==1){
                dfs(graph,visited,i);
            }

        }

    }
}
