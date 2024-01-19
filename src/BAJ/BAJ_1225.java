package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAJ_1225 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String [] arr = A.split("");
        String B = st.nextToken();
        String [] brr = B.split("");
       long sum =0;
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<brr.length; j++){
                sum += Integer.parseInt(arr[i])*Integer.parseInt(brr[j]);
            }
        }
        System.out.println(sum);
    }
}
