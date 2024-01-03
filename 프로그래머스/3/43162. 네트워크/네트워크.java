class Solution {
    static boolean [] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i =0; i<n; i++){
            if(!visited[i]){
                dfs(i,n,computers, visited);
                answer++;
            }
        }
        return answer;
    }
    public static void dfs(int start, int n, int[][] computers, boolean [] visited){
        visited[start]=true;
            for(int j =0; j<n; j++){
                if(!visited[j]&&computers[start][j]==1&&start!=j){
                    dfs(j,n, computers, visited);
                }
            }
    }
}