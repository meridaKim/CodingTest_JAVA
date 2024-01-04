package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10431 {
    static int testCase;
    static int[] height;
    static int[] step;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        testCase = Integer.parseInt(in.readLine());
        StringBuilder sb= new StringBuilder();
        StringTokenizer st;
        for(int tc=1;tc<=testCase;tc++) {
            st = new StringTokenizer(in.readLine()," ");
            height = new int[20];


            sb.append(st.nextToken()).append(" ");
            int cnt = 0;
            for(int i=0;i<height.length;i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0;i<height.length;i++) {
                for(int j=0;j<i;j++) {
                    if(height[j] > height[i]) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);




    }
}
