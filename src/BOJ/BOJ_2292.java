package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2292 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int step =1;
        int start =2;

        if(target==1) System.out.println(1);
        else {
            while(start<=target){
            start = start+(6*step);
            step++;
        }
            System.out.println(step);
        }
    }
}
