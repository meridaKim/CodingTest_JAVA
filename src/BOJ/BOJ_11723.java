package BOJ;
import java.io.*;
import java.util.*;
import java.lang.*;
public class BOJ_11723 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(in.readLine()); // 연산의 개수
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++) {
            StringTokenizer st = new StringTokenizer(in.readLine()," ");
            String inst = st.nextToken(); // 명령어
            int num=0; // 임시 초기화

            switch(inst) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    set.add(num);
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    set.remove(num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(set.contains(num)? "1":"0").append('\n');
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if(set.contains(num)) {
                        set.remove(num);
                    }else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for(int j=1;j<=20;j++)
                        set.add(j);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.print(sb);
    }

}