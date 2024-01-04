package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * 영역 구하기*/
class location{
    int x;
    int y;
    location(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ_2583 {
    static int n,m,k;
    static ArrayList<Integer> list = new ArrayList<>();
    static int [][] board;
    static boolean [][] visited;
    static StringTokenizer st;
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};
    static int count =0;
    static int yard;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[m][n];
        visited = new boolean[m][n];
        for(int i =0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2= Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            /**
             * 직사각형의 좌표(y,x)*/
            for(int j = y1; j<y2; j++){
                for(int l = x1; l<x2; l++){
                    board[j][l] =1;
                }
            }
        }

        for(int i =0; i<m; i++){
           for(int j =0; j<n; j++){
               if(!visited[i][j]&&board[i][j]==0){
                   bfs(i,j);
                   count++;
               }
           }
        }
        Collections.sort(list);
        StringBuilder sb  = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(count);
        System.out.println(sb);

    }
    public static void bfs(int x, int y){
        yard = 1;
        Queue<location> que = new LinkedList<>();
        que.offer(new location(x,y));
        visited[x][y] = true;
    while(!que.isEmpty()){
            location cur = que.poll();
            for(int i =0; i<4; i++){
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];

                if(nx>=0&&ny>=0&&nx<m&&ny<n){
                    if(!visited[nx][ny]&&board[nx][ny]==0) {
                        que.offer(new location(nx,ny));
                        visited[nx][ny]=true;
                        yard++;
                    }
                }
            }
        }list.add(yard);
    }
}
