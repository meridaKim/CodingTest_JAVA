import java.util.*;
class Position{
    public int x;
    public int y;

    Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Bfs_maze {
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};
    static int [][] board;
    static int [][] dist;
    public static void main(String [] args){
        /**
         * 7
         * 7
         * 0 0 0 0 0 0 0
         * 0 1 1 1 1 1 0
         * 0 0 0 1 0 0 0
         * 1 1 0 1 0 1 1
         * 1 1 0 1 0 0 0
         * 1 0 0 0 1 0 0
         * 1 0 1 0 0 0 0
         * */
        Bfs_maze bfs_maze = new Bfs_maze();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();//행
        int n = scanner.nextInt();//열

        board = new int [m+1][n+1];
        for(int i =1; i<m+1; i++){
            for(int j =1; j<n+1; j++){
                board[i][j] = scanner.nextInt();
            }
        }
        dist = new int [m+1][n+1];
        bfs_maze.bfs(1,1, m, n);
        if(dist[m][n]==0){
            System.out.println(-1);
        }else System.out.println(dist[m][n]);

    }
    public void bfs(int x, int y, int m, int n){
        Queue<Position> que = new LinkedList<>();
        que.offer(new Position(x,y));
        board[x][y] = 1;
        while(!que.isEmpty()){
            Position tmp = que.poll();
            for(int i =0; i<4;i++){
                int nx = tmp.x+dx[i]; //좌우 이동을 표현 ex) tmp.x(현재 idx 위치)+1 : 우로 이동
                int ny = tmp.y+dy[i]; //상하 이동을 표현 ex) tmp.y(현재 idx 위치)-1 : 우로 이동
                //격자 범위 안이어야 하며, 0일때만 이동이 가능하다.
                if(nx>0&&nx<m+1&&ny>0&&ny<n+1&&board[nx][ny]==0){
                    board[nx][ny] = 1;
                    que.offer(new Position(nx, ny));
                    dist[nx][ny] = dist[tmp.x][tmp.y]+1;
                }
            }
        }
    }
}
