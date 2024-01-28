import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 배추 농사 */
class Lettuce{
    int x;
    int y;
    Lettuce(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static StringTokenizer st;
    static int M;
    static int N;

    static int V;
    static int [][] box;
    static Queue<Lettuce> que;
    static boolean[][] visited;
    static int count;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int l=0; l<T; l++){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            box = new int [N][M];
            visited = new boolean[N][M];
            que = new LinkedList<>();
            count =0;
            for(int i=0;  i<V; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                box[y][x] =1;
            }

            for(int i=0; i<N; i++){
                for(int j =0; j<M; j++){
                    if(box[i][j]==1&&!visited[i][j]) {
                        count++;
                        bfs(j, i);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(int x, int y){
        que.add(new Lettuce(x, y));
        visited[y][x] = true;
        while(!que.isEmpty()){
             Lettuce now = que.poll();
             int [] dx = {0,0,-1,1};
             int [] dy = {1,-1,0,0};
             for(int i=0; i<4; i++){
                 int nx = now.x+dx[i];
                 int ny = now.y+dy[i];
                 if(nx<0||nx>M-1||ny<0||ny>N-1) continue;
                 if(!visited[ny][nx]&&box[ny][nx]==1) {
                     que.add(new Lettuce(nx, ny));
                     visited[ny][nx] =true;
                 }
             }
        }
    }
}
