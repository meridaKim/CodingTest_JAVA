import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main {
    static StringTokenizer st;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n+1];
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i<n+1; i++){
            arr[i] = i;
        }
        for(int i =0; i<m; i++){
            int tmp =0;
            st = new StringTokenizer(br.readLine());
            int bs1 = Integer.parseInt(st.nextToken());
            int bs2 = Integer.parseInt(st.nextToken());
            tmp = arr[bs1];
            arr[bs1] = arr[bs2];
            arr[bs2] = tmp;
        }
        for(int i =1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
