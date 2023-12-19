package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/**
 * 안전 구역 */
class Ground{
    int x;
    int y;
    Ground(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ_2468 {
    static int n;
    static int[][] map;
    static boolean[][] checked;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0,- 1, 0, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        int maxHeight=0;
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] > maxHeight) {
                    maxHeight =map[i][j];
                }
            }
        }

        int max =0;
        // 1. 모든 지역 탐색
        for(int i=0; i<maxHeight+1; i++) {
            checked = new boolean[n][n];
            int cnt=0;
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    // 2. 안전 영역 탐지
                    if(!checked[j][k] && map[j][k] > i){
                        cnt+=bfs(j,k,i); // 해당 안전영역 탐색 시작
                    }

                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
    // 안전 영역 DFS탐색
    static int bfs(int x, int y, int height) {
        Queue<Ground> q = new LinkedList<>();
        q.add(new Ground(x,y));
        checked[x][y] = true;

        while(!q.isEmpty()) {
            Ground cur = q.poll();
            int px = cur.x;
            int py = cur.y;

            for(int i=0; i<4; i++) {
                int nx = px +dx[i];
                int ny = py +dy[i];

                if(nx<0 || ny<0 || nx>n-1 || ny >n-1) continue;
                if(checked[nx][ny]) continue;
                if(map[nx][ny]> height) {
                    checked[nx][ny] = true;
                    q.add(new Ground(nx,ny));
                }
            }
        }
        return 1;
    }
}