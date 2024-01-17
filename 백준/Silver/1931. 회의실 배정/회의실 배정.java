
import java.util.*;
import java.io.*;
class Meeting implements Comparable<Meeting>{
    int start;
    int end;
    Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
    public int compareTo(Meeting o1){
        if(this.end==o1.end){
            return this.start - o1.start;
        }return this.end - o1.end;
    }
}
public class Main{
    static int N;
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Meeting> list = new ArrayList<>();
        for(int i =0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start =Integer.parseInt(st.nextToken());
            int end =Integer.parseInt(st.nextToken());
            list.add(new Meeting(start, end));
        }
        Collections.sort(list);
        int now=-1;
        int count=0;
        for(int i=0; i<N; i++){
            if(list.get(i).start>=now){
                now = list.get(i).end;
                count++;
            }
        }
        System.out.println(count);
    }
}
