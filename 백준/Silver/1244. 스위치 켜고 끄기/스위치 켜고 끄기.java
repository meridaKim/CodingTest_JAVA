import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.MAX_VALUE;
        for(int i =1; i<n+1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int s = Integer.parseInt(br.readLine());
        for(int i =0; i<s; i++){
            st = new StringTokenizer(br.readLine());
                int gender = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if(gender==1){
                    for(int k=num; k<arr.length; k++){
                        if(k%num==0){
                            if(arr[k]==0) arr[k]=1;
                            else arr[k] =0;
                        }
                    }
                }
                if(gender==2){
                        int start = num-1;
                        int end = num+1;
                        while(start>0&&end<n+1){
                            if(arr[start]!=arr[end]){
                                break;
                            }
                            start--;
                            end++;
                        }
                        if(arr[start+1]==arr[end-1]) {
                            for (int l = start+1; l <= end-1; l++) {
                                if (arr[l] == 0) arr[l] = 1;
                                else arr[l] = 0;
                            }
                        }
                }
            }

        for(int i =1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if(i%20==0) {
                System.out.println();
            }
        }
    }
}
