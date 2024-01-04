package BAJ;

import java.util.*;
import java.io.*;
import java.lang.*;
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class BOJ_2178 {
    static int board[][];
    static boolean visited[][];
    static int N;
    static int M;
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N ; i++) {
             String str = br.readLine();
            char[] chr = str.toCharArray();
            for(int j = 0 ; j < chr.length ; j++) {
                board[i][j] = Character.getNumericValue(chr[j]);
            }
        }
        visited[0][0] = true;
        bfs_bk(0,0);
        System.out.println(board[N-1][M-1]);
    }
    public static void bfs_bk(int x, int y){
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x, y));
        while(!que.isEmpty()){
            Point cur = que.poll();
            for(int i =0; i<4; i++){
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];
                if(nx<0 || nx>=N || ny<0 || ny>=M){
                    continue;
                }
                if(!visited[nx][ny]||board[nx][ny]==1){
                    que.offer(new Point(nx,ny));
                    board[nx][ny] = board[cur.x][cur.y]+1;
                    visited[nx][ny] =true;
                }

            }
        }
    }


}
