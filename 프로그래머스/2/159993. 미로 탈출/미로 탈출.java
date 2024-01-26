import java.util.*;
class Solution {
    final int[] dx = {1, -1, 0, 0};
    final int[] dy = {0, 0, -1, 1};
    
    int n, m;
    
    public int solution(String[] maps) {
        int answer = -1;
        
        n = maps.length;
        m = maps[0].length();
        
        Road start = null;
        Road lever = null;
        Road exit = null;
        
        char[][] map = new char[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = maps[i].charAt(j);
                
                if(map[i][j] == 'S'){
                    start = new Road(i, j);
                }else if(map[i][j] == 'L'){
                    lever = new Road(i, j);
                }else if(map[i][j] == 'E'){
                    exit = new Road(i, j);
                }
            }
        }
        
        int startToLever = bfs(map, start, lever);
        
        if(startToLever != -1){
            int leverToExit = bfs(map, lever, exit);
            
            if(leverToExit != -1){
                answer = startToLever + leverToExit;
            }
        }
        
        return answer;
    }
    
    private int bfs(char[][] map, Road start, Road dest){
        Queue<Road> qu = new LinkedList<>();
        qu.add(start);
        boolean[][] visited = new boolean[n][m];
        visited[start.x][start.y] = true;
        
        while(!qu.isEmpty()){
            Road cn = qu.poll();
            
            if(map[cn.x][cn.y] == map[dest.x][dest.y]){
                return cn.depth;
            }
            
            for(int i=0; i<4; i++){
                int nx = cn.x + dx[i];
                int ny = cn.y + dy[i];
                
                if(!inRange(nx, ny) || map[nx][ny] == 'X' || visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                
                qu.add(new Road(nx, ny, cn.depth+1));
            }
        }
        
        return -1;
    }
    
    private boolean inRange(int x, int y){
        return (x>=0 && y>=0 && x<n && y<m);
    }
    
    
    private class Road{
        int x, y, depth;
        
        Road(int x, int y){
            this.x = x;
            this.y = y;
            this.depth = 0;
        }
        
        Road(int x, int y, int depth){
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}