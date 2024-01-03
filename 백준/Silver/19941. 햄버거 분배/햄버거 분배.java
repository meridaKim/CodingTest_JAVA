import java.util.*;
import java.io.*;
/**
 * 햄버거 분배*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        char[] list = str.toCharArray();
        boolean[] ate = new boolean[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (list[i] == 'P') {
                int startIndex = Math.max(i - k, 0);
                int endIndex = Math.min(i + k, n - 1);
                for (int j = startIndex; j <= endIndex; j++) {
                    if (list[j] == 'H' && !ate[j]) {
                        ate[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}