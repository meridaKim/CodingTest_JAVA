import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int n, answer = 0;
    private static int[] T, P;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        T = new int[n];
        P = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(answer);
    }

    private static void dfs(int index, int value) {
        if (index >= n) {
            answer = Math.max(answer, value);
            return;
        }

        // 해당 index를 포함
        if (index + T[index] <= n) dfs(index + T[index], value + P[index]);
        else dfs(index + T[index], value); // n을 넘어가면 value 합치지 않음

        dfs(index + 1, value); // 해당 index 미포함
    }
}