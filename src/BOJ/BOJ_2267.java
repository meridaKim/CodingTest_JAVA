package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.*;
/**
 * 단지 번호 붙이기*/
class loca{
    int x;
    int y;
    loca(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ_2267 {
    static int n;
    static int count;
    static int [] dx ={0,0,-1,1};
    static int [] dy ={1,-1,0,0};
    static int[][] board;
    static boolean [][] visited;


    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        board = new int [n][n];
        visited = new boolean[n][n];
        for(int i =0; i<n; i++){
            String str = br.readLine();
            char [] chr = str.toCharArray();
            for(int j =0; j<n; j++){
                board[i][j]=Character.getNumericValue(chr[j]);
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                count =0;
                if(board[i][j]==1){
                    bfs(i,j);
                    list.add(count);
                    result++;
                }
            }
        }
        Collections.sort(list);
        System.out.println(result);
        for(int a : list){
            System.out.println(a);
        }
    }
    public static void bfs(int x, int y){
        Queue<loca> que = new LinkedList<>();
        visited[x][y] = true;
        que.offer(new loca(x,y));
        while(!que.isEmpty()){
            count++;
            loca cur = que.poll();
            for(int i =0; i<4; i++){
                int nx = dx[i]+cur.x;
                int ny = dy[i]+cur.y;

                if(nx>=0&&ny>=0&&nx<n&&ny<n){
                    if(!visited[nx][ny]&&board[nx][ny]==1){
                        board[nx][ny] = 0;
                        que.offer(new loca(nx,ny));
                        visited[nx][ny]=true;
                    }
                }

            }
        }

    }

}
