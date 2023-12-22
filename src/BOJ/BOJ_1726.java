package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * 로봇
 * */
class Robot{
    int x;
    int y;
    int dir;
    Robot(int x, int y, int dir){
        this.x =x;
        this.y = y;
        this.dir =dir;
    }
}
public class BOJ_1726 {
    static StringTokenizer st;
    static int M;
    static int N;
    static int [][] map;
    static int x;
    static int y;
    static int dir;
    static int destx;
    static int desty;
    static int destdir;
    static Queue<Robot> que;
    static int [] dx = {0,0,-1,-1};
    static int [] dy = {1,-1,0,0};
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        que = new LinkedList<>();
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++){
               map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        dir =  Integer.parseInt(st.nextToken());
        que.add(new Robot(x,y,dir));

        st = new StringTokenizer(br.readLine());
        destx = Integer.parseInt(st.nextToken());
        desty = Integer.parseInt(st.nextToken());
        destdir =  Integer.parseInt(st.nextToken());

        while(!que.isEmpty()){
            Robot cur = que.poll();
            int x = cur.x;
            int y = cur.y;
            for(int i =0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
            }

        }
    }
}
