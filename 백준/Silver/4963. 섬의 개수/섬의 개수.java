import java.util.*;
import java.io.*;

public class Main {
	static int arr[][];
	static boolean visit[][];
	static int dx[] = {0, 0, -1 ,1, -1, 1, -1, 1}; 
	static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1}; 

	static int w, h, nx, ny;

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = " ";
		while( !(str = br.readLine()).equals("0 0") ) {
			st = new StringTokenizer(str);
	

			w = Integer.parseInt(st.nextToken()); // 너비
			h = Integer.parseInt(st.nextToken()); // 높이
			arr = new int[h][w];
			visit = new boolean[h][w];

			for(int i=0; i<h; i++) {
				st = new StringTokenizer(br.readLine());

				for(int j=0; j<w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
	
				}
			}

			int island_count = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {

					if(!visit[i][j] && arr[i][j] == 1) {
						island_count++;
						DFS(i, j);
					}
				}
			} 

			sb.append(island_count).append('\n');
		}

		System.out.println(sb);
	} 

	static void DFS(int x, int y) {
		visit[x][y] = true;

		for(int i=0; i<8; i++) {
			nx = dx[i] + x;
			ny = dy[i] + y;

			if(range_check() && !visit[nx][ny] && arr[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}

	} 

	static boolean range_check() {
		return (nx >= 0 && ny >= 0 && nx < h && ny < w);
	} 

}