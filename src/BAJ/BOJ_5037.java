package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_5037 {
    static int [] arr;
    /**
     * Equilateral :  세 변의 길이가 모두 같은 경우
     * Isosceles : 두 변의 길이만 같은 경우
     * Scalene : 세 변의 길이가 모두 다른 경우*/
    public static void main(String [] args)throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       while(true){
           arr = new int[3];
           StringTokenizer st = new StringTokenizer(bf.readLine());
           for(int i =0; i<arr.length; i++) {
               arr[i] = Integer.parseInt(st.nextToken());
           }
           if(arr[1]==0) break;
           Arrays.sort(arr);
           if(arr[0]+arr[1]<=arr[2]) System.out.println("Invalid");
           else if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==arr[2]) System.out.println("Equilateral");
           else if(arr[0]==arr[1]||arr[1]==arr[2]||arr[0]==arr[2]) System.out.println("Isosceles");
           else System.out.println("Scalene");



       }
    }
}
