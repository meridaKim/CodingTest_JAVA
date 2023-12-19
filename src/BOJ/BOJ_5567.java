package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import sun.awt.image.ImageWatched.Link;

/**
 * 결혼식 */
public class BOJ_5567 {
    static int n;
    static int m;
    static int [][] graph;
    static int [] dept;
    static int count;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
       graph = new int[n+1][n+1];
       dept = new int[n+1];
       count =0;
        for(int i =1; i<m+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph[v1][v2]=graph[v2][v1]=1;
        }
        Arrays.fill(dept,-1);
        bfs(1);
        System.out.println(count);
    }
    public static void bfs(int v){
        Queue<Integer> que = new LinkedList<>();
        que.offer(v);
        dept[v] =0;
        while(!que.isEmpty()){
            int cur = que.poll();
                if(dept[cur]<=2&&1<=dept[cur]) count++;
                if(dept[cur]==2) continue;
                    for(int i =0; i<graph[cur].length; i++){
                        if(dept[i]!=-1) continue;
                        que.offer(i);
                        dept[i] = dept[cur]+1;
                    }
        }
    }

}
