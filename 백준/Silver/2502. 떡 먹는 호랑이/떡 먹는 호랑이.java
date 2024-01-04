import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(D == 3)
            bw.write( 1 + "\n" + (K-1));
        else{	//3일보다 클 때
            int x = 1, y = 1;	
            for(int i=4;i<=D;i++){
                int temp  = y;
                y = x + y;
                x = temp;
            }
            int size = K/y;	
            for(int i = size-1;i>=0;i--){
                if((K - (i*y)) % x == 0){	
                    bw.write( (K - (i*y)) / x+ "\n" + i);
                    break;
                }
            }
        }
        bw.flush();	
        bw.close();
        br.close();
    }
}