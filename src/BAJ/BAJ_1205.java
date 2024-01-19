package BAJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
class Score implements Comparable<Score>{
    int score;
    public Score(int score){
        this.score = score;
    }
    @Override
    public int compareTo(Score o) {
        return o.score-score;
    }
}
public class BAJ_1205 {
    static StringTokenizer st;
    public static void main(String []args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Score> list = new ArrayList<>();
        for(int i =0; i<N; i++){
            Score a = new Score(Integer.parseInt(st.nextToken()));
            list.add(a);
        }
        if(p>list.size()){
            list.add(new Score(T));
            System.out.println(list.indexOf(T)+1);
        }else if(p== list.size()){
           Score com = list.get(list.size());
            if(com.score<T){
                list.remove(list.get(list.size()));
                list.add(new Score(T));
            }
        } else System.out.println(-1);


    }
}
