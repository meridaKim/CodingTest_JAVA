package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BAJ_10822 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum =0;
        String str = st.nextToken();
        String [] arr = str.split(",");
        for(int i =0; i<arr.length; i++){
            sum+=Integer.parseInt(arr[i]);
        }
        System.out.println(sum);

    }
}
