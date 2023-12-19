package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11724 {

    static int n;
    static int m;
    static int [][] graph;
    static int count;
    static boolean visited[];
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int [n+1][n+1];
        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                graph[start][end] = graph[end][start]=1; //양방향

        }
        visited= new boolean[n+1];
        for(int i =1; i<n+1; i++){
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);


    }
    public static void dfs(int start){
        visited[start] = true;
        for(int i =1; i<n+1; i++){
            if(visited[i]) continue;
            if(graph[start][i]==0) continue;
                dfs(i);
        }
    }
}
