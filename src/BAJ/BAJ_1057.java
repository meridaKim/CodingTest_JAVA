package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAJ_1057 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int im = Integer.parseInt(st.nextToken());
        int [] arr = new int[n+1];
        for(int i =1; i<n+1; i++){
            arr[i] =i;
        }
        int count  =0;
        while(kim!=im){
            kim = kim%2+kim/2;
            im = im%2+im/2;
            count++;
        }
        System.out.println(count);
    }
}
