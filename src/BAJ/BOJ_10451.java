package BAJ;

import java.util.*;
import java.io.*;
/**
 * 순열 사이클
 * input
 * 2
 * 8
 * 3 2 7 8 1 4 5 6
 * 10
 * 2 1 3 4 5 6 7 9 10 8*/
public class BOJ_10451 {
    static int testCase;
    static int n;
    static boolean [] visited;
    static int []graph;
    static int count;
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for(int i =1; i<testCase+1; i++){
            n = Integer.parseInt(br.readLine());
            graph = new int[n+1];
            visited = new boolean[n+1];
            count =0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j<n+1; j++){
                graph[j] = Integer.parseInt(st.nextToken());
            }
            for(int k =1; k<n+1; k++){
                if(!visited[k]){
                    dfs(k);
                    count++;
                }
            }System.out.println(count);
        }

    }
    public static void dfs(int start){
        for(int i =1; i<n+1; i++){
            visited[start] = true;
            if(!visited[graph[start]]) dfs(graph[start]);
        }
    }
}
