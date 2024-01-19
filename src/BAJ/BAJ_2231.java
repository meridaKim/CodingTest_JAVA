package BAJ;

import java.util.Scanner;

public class BAJ_2231 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer =0;
        int target =0;
        for(int i =n; i>=1; i--){
            String num = String.valueOf(i);
            answer +=Integer.parseInt(num);
            char [] arr = num.toCharArray();
            for(int j =0; j<arr.length; j++){
                answer +=(int)(arr[j]-'0');
            }
            if(answer==n) target=i;
            answer=0;
        }

        System.out.print(target);
    }
}
