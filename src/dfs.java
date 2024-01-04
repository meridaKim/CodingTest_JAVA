import java.awt.SystemTray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dfs {
    static int n;
    static int m;
    static int v;
    static int [][] graph;
    static boolean[] visited;
    static StringTokenizer st;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new int[n+1][m+1];
        visited = new boolean[n+1];
        for(int i = 1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph[v1][v2] = graph[v2][v1]=1;
        }
        dfs(v,graph,visited);


    }
    public static void dfs(int start, int [][] graph, boolean[] visited){
        visited[start] =true;
        if(start == graph.length){
            return;
        }
        System.out.print(start+" ");
        for(int i =1; i<graph.length; i++){
            if(!visited[i]&&graph[start][i]==1){
                dfs(i,graph,visited);
            }
        }
    }
}
