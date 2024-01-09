import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 외판원 순회*/
public class Main {
    static StringTokenizer st;
    static int n;
    static int [][] board;
    static boolean []visited;
    static int sum;
    static int min;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        board = new int [n+1][n+1];
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++){
                int cost = Integer.parseInt(st.nextToken());
                board[i][j] = cost;
            }
        }
        min = Integer.MAX_VALUE;
        visited= new boolean[n+1];
        for(int i =0; i<n; i++){
            visited[i] =true;
            dfs(i,i, 0,0);
        }

        System.out.println(min);
    }
    public static void dfs(int start, int now, int dept, int sum){
        if(dept == n-1){
            if(board[now][start]!=0){
                sum+=board[now][start];
                min = Math.min(min,sum);
            }
            return;
        }
        for(int i =0; i<n+1; i++){
                if(!visited[i]&&board[now][i]!=0){
                    visited[i] =true;
                    dfs(start, i, dept+1, sum+board[now][i]);
                    visited[i] = false;
            }
        }
    }
}
