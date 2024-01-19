package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAJ_2745 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        char [] chr = new char[N.length()];
        int answer =0;
        for(int i =N.length()-1; i>=0; i--){
            chr[i] = N.charAt(i);
            if('A'<=chr[i] && chr[i]<='Z') answer += (int)(chr[i]-'A'+10)* (int)Math.pow(b,i);
            else answer +=(int)(chr[i]-48)*(int)Math.pow(b,i);
        }
        System.out.println(answer);

    }
}
