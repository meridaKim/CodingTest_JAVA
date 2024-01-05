package CDT;
import java.io.*;
import java.util.*;

public class CDT_COMPARE_NUMBER_SIZE {
        static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        static StringTokenizer st;
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int [] count = new int [n+1];
            for(int i =0; i<n+1; i++){
                graph.add(new ArrayList<Integer>());
            }
            for(int i =0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());
                graph.get(v1).add(v2);
            }
            for(int i =0; i<n+1; i++){
                for(int j =0; j<graph.get(i).size(); j++){
                    count[graph.get(i).get(j)]++;
                }
            }
            PriorityQueue <Integer> que = new PriorityQueue<>();
            for(int i=1; i<count.length; i++){
                if(count[i]==0){
                    que.add(i);
                }
            }
            while(!que.isEmpty()){
                int now = que.poll();
                bw.write(String.valueOf(now)+" ");
                List<Integer> list = graph.get(now);
                for(int i =0; i<list.size(); i++){
                    count[list.get(i)]--;
                    if(count[list.get(i)]==0){
                        que.add(list.get(i));
                    }
                }
            }
            bw.flush();
        }
    }

