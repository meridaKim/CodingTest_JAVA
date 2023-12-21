package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.*;
/**
 * 아기 상어
 * 0: 빈 칸
 * 1, 2, 3, 4, 5, 6: 칸에 있는 물고기의 크기
 * 9: 아기 상어의 위치*/
class Fish{
    int x;
    int y;
    int cost;
    public Fish(int x, int y, int cost){
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}
public class BOJ_16236 {
    static int N;
    static int [][] board;
    static StringTokenizer st;
    static Queue<Fish> que;
    static int [] dx = {0,0,-1,-1};
    static int [] dy = {1,-1,0,0};
    static int amount;
    static int maxY=Integer.MAX_VALUE;
    static int maxX=Integer.MAX_VALUE;
    public static void main(String []args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        que = new LinkedList<>();
        amount =0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j]==9) que.offer(new Fish(i,j,2));
                //처음 상어의 크기==2
                else if(board[i][j]!=0){
                    amount++;
                    maxY = Math.min(maxY,j);
                    //가장 높은 곳 물고기 먼저
                    maxX = Math.min(maxX,i);
                    //높은 곳 물고기가 많다면 왼쪽 먼저
                }
            }
        }
    }
    public static int bfs() {
        while (!que.isEmpty()) {
            Fish shark = que.poll();
            for(int i =0; i<4; i++){
                int nx = shark.x+dx[i];
                int ny = shark.y+dy[i];
                if(-1<nx&&nx<N&&-1<ny&&ny<N){
                    if(board[nx][ny]<shark.cost&&board[nx][ny]!=0){
                        board[nx][ny] = 0;
                    }
                }
            }
            /*물고기는 new Fish(i,j,board[i][j])*/

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0)
                    return 0;
            }
        }return 1;
    }
}
