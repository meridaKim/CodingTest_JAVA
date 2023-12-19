public class programmers_network {
        static int answer;
        public int programmers_network(int n, int[][] computers) {
            answer =0;
            boolean [] visited = new boolean[n];
            for(int i = 0; i<n; i++){
                if(!visited[i]){
                    dfs(n, i, computers, visited);
                    answer++;
                }
            }
            return answer;
        }
        public void dfs(int n, int i, int [][] computers, boolean visited[]){
            visited[i] = true;

            for(int j = 0; j<n; j++){
                if(!visited[j]&&computers[i][j]==1&&i!=j){
                    dfs(n, j , computers, visited);
                }

            }
        }

}
