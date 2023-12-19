import java.util.*;

public class bfs {
    static LinkedList<Queue> queue;
    public static void main(String [] args){
        int [][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        boolean [] visited = new boolean[graph.length];
        System.out.println(bfs(1, graph, visited));
    }
   static String bfs(int start, int [][] graph,boolean [] visited){
        Queue<Integer> que = new LinkedList<Integer>();
       StringBuilder sb = new StringBuilder();
        que.offer(start);
        visited[start] = true;
        while(!que.isEmpty()){
            int cur = que.poll();
            sb.append(cur + " -> ");
            for(int i = 0; i<graph[cur].length; i++){
                int tmp = graph[cur][i];
                if(!visited[tmp]){
                    visited[tmp] = true;
                    que.offer(tmp);
                }
            }
        } return sb.toString();
    }
}
