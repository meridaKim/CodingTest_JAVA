package BOJ;
import java.io.*;
import java.util.*;
class Fish {

    int x;
    int y;
    int dist;

    Fish(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}

public class BOJ_16236 {

    static final int dx[] = {0, 0, 1, -1};
    static final int dy[] = {1, -1, 0, 0};
    static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Fish> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 9) {
                    q.add(new Fish(i, j, 0));
                    board[i][j] = 0;
                }
            }
        }

        int size = 2;
        int eat = 0;
        int ans = 0;
        while (true) {
            ArrayList<Fish> eatFish = new ArrayList<>();
            int[][] dist = new int[n][n];

            while (!q.isEmpty()) {
                Fish cur = q.poll();
                int x = cur.x;
                int y = cur.y;

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                        if (dist[nx][ny] == 0 && board[nx][ny] <= size) {
                            dist[nx][ny] = dist[x][y] + 1;
                            q.add(new Fish(nx, ny, dist[nx][ny]));
                            if (1 <= board[nx][ny] && board[nx][ny] <= 6 && board[nx][ny] < size) {
                                eatFish.add(new Fish(nx, ny, dist[nx][ny]));
                            }
                        }
                    }
                }
            }

            if (eatFish.size() == 0) {
                System.out.println(ans);
                return;
            }

            Fish nowFish = eatFish.get(0);
            for (int i = 1; i < eatFish.size(); i++) {
                if (nowFish.dist > eatFish.get(i).dist) {
                    nowFish = eatFish.get(i);
                    //크기가 같은 물고기라면
                } else if (nowFish.dist == eatFish.get(i).dist) {
                    //위쪽 물고기
                    if (nowFish.x > eatFish.get(i).x) {
                        nowFish = eatFish.get(i);
                    } else if (nowFish.x == eatFish.get(i).x) {
                        //그 중에서도 왼쪽 물고기
                        if (nowFish.y > eatFish.get(i).y) {
                            nowFish = eatFish.get(i);
                        }
                    }
                }
            }
            board[nowFish.x][nowFish.y] = 0;
            ans += nowFish.dist;
            eat++;
            if (size == eat) {
                size++;
                eat = 0;
            }
            q.add(nowFish);

        }

    }

}