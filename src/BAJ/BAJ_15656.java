package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAJ_15656 {
    static int [] tmp;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){

            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        tmp = new int[m];
        StringBuilder sb = new StringBuilder();
        dfs(0,arr,m, tmp,sb);
        System.out.println(sb);

    }
    public static void dfs(int i, int [] arr, int m, int [] tmp,StringBuilder sb){

        if(i==m){
            for(int k=0; k<m; k++){
                sb.append(tmp[k]+" ");
            }
            sb.append("");
        }else{
            for(int j =0; j<arr.length; j++){
                tmp[i] = arr[j];
                dfs(i+1, arr,m,tmp,sb);
            }
        }

    }
}
