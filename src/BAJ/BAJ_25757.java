package BAJ;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;
public class BAJ_25757 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        int person = 0;
        switch (game){
            case "Y":
                person = 2;
                break;
            case "F":
                person = 3;
                break;
            case "O":
                person = 4;
                break;
        }
        HashSet<String> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(br.readLine());
        }
        System.out.print(set.size()/(person-1));
    }
}
