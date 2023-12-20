package BOJ;
import java.io.*;
import java.util.*;
/**
 * 토마토 */
class Tomato{
    int x;
    int y;
    public Tomato(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ_7576 {
    static int N; // 세로 칸의 수
    static int M; // 가로 칸의 수
    static int[][] box; // 그래프배열
    static boolean[][] visited; //방문한 자리
    static int count = Integer.MIN_VALUE; // 최소 날짜
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static Queue<Tomato> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        M = Integer.parseInt(st.nextToken()); // 세로 칸  초기화
        N = Integer.parseInt(st.nextToken()); // 가로 칸 초기화

        // 그래프 초기화
        box = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    q.add(new Tomato(i,j));
                }
            }
        }
        System.out.println(bfs());
    }

    public static int bfs() {
        while (!q.isEmpty()) { // 큐가 다 빌때까지 실행
            Tomato cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            // 4방 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //그래프 범위 안에 있을 경우
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (box[nx][ny] == 0) {
                        q.add(new Tomato(nx,ny));
                        box[nx][ny] = box[x][y] + 1; // 새로 추가된 곳은 원래 있던 수 + 1
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) { // 그래프안에 0 이 존재하면 답은 -1
                    return -1;
                }
                // 그래프의 날짜중에 가장 큰 수를 찾으면 그것이 최종날짜
                count = Math.max(count, box[i][j]);
            }
        }

        // 저장될 때부터 모든 토마토가 익어익는상태라면
        if (count == 1) {
            return 0;
        } else { // 아닐 경우 최종날짜 - 1 출력
            return count-1;
        }
    }
}