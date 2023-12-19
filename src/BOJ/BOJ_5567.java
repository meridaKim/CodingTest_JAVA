package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


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
        //방문 여부를 dept로 구분하므로 -1로 초기화
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
            //dept =0,1,2일때 현재 인물은 초대 가능하므로 count++;
            if(-1<dept[cur]&&dept[cur]<3) count++;
            //dept ==2이라면 현재 인물과 연결된 사람은 dept==3이 되므로 초대 불가
            if(dept[cur]==2) continue;
            for(int i =0; i<graph[cur].length; i++){
                if(dept[i]==-1&&graph[cur][i]==1){
                    dept[i] = dept[cur]+1;
                    que.add(i);
                }
            }

        }count--;
        //상근이 자신을 제외해야 하므로 (dept==0이 포함됨) -1;
    }

}
