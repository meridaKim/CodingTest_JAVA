package BAJ;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
/**
DFS와 BFS
 * */
public class BAJ_1260 {
    static int [][] linked;
    static int n;
    static int m;
    static int v;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        linked = new int[n+1][m+1];
        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            linked[start][end]=linked[end][start] = 1;
        }
        visited = new boolean[n+1];
        dfs(v);
        sb.append("\n");
        visited = new boolean[n+1];
        bfs(v);
        System.out.println(sb);

    }
    public static void dfs(int v){
        visited[v] =true;
        sb.append(v+" ");
        if(v==linked.length){
            return;
        }
        for(int i =1; i<linked.length; i++){
            if(linked[v][i]==1&&visited[i]==false){
                dfs(i);
            }

        }

    }



    public static void bfs(int v){
        Queue<Integer> que = new LinkedList<>();
        que.offer(v);
        visited[v]=true;
        while(!que.isEmpty()){
            int cur = que.poll();
            sb.append(cur+" ");
            for(int i = 1; i< linked.length; i++){
                if(!visited[i]&&linked[cur][i]==1){
                    visited[i]=true;
                    que.offer(i);

                }
            }
        }
    }
}
/*
4 5 6 8 2 10 1 7 3 9
4 5 6 10 8 1 2 3 9 7
**/
