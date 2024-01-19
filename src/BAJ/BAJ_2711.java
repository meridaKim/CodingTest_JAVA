package BAJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BAJ_2711 {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            StringBuffer sb = new StringBuffer();
            sb.append(st.nextToken());
//            sb.deleteCharAt(p-1);
            sb.delete(p-1,p);
            System.out.println(sb+" ");

        }

    }
}
