package BAJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BAJ_5014 {
    static int f;
    static int s;
    static int g;
    static int u;
    static int d;
    static int count;
    static int [] visited;
    public static void main(String []args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        visited = new int[f+1];
        count =0;
        if(d==0){
            System.out.println("use the stairs");
        }else{
            bfs(s);
        }

    }
    public static void bfs(int start){
        Queue<Integer> que = new LinkedList<>();

        visited[start] = 1;
        que.add(start);
        while(!que.isEmpty()){
            int now = que.poll();
            if(now==g){
                System.out.println(visited[now]-1);
            }
            if(visited[now+u]==0&&now+u<=f) {
                    visited[now+u] = visited[now]+1;
                    que.add(now+u);
            }if(visited[now-d]==0&&now-d<0){
                visited[now-d] = visited[now]+1;
                    que.add(now-d);
            }
        }
        if(visited[g]==0)
            System.out.println("use the stairs");
    }
}
