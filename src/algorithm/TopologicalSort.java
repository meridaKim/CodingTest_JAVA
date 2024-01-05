package algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;


public class TopologicalSort {
    public static void main(String [] args)throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] countEdge = new int[9]; //인덱스 1부터 시작
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<countEdge.length; i++){
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(4);
        graph.get(2).add(5);
        graph.get(2).add(6);
        graph.get(3).add(6);
        graph.get(4).add(2);
        graph.get(4).add(8);
        graph.get(7).add(3);
        graph.get(8).add(6);

        countEdge[2] =2;
        countEdge[3] =1;
        countEdge[4]= 1;
        countEdge[5]= 1;
        countEdge[6]= 3;
        countEdge[8]= 1;

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i =1; i<countEdge.length; i++){
            if(countEdge[i]==0){
                que.add(i);
            }
        }
        while(!que.isEmpty()){
            int now = que.poll();
            bw.write(String.valueOf(now)+" ");//노드 꺼내기

            List<Integer> list = graph.get(now); //꺼낸 노드와 인접 노드 list에 저

            for(int i =0; i<list.size(); i++){
                countEdge[list.get(i)]--;   //꺼낸 노드로 진입했으므로 진입 차수 1--
                if(countEdge[list.get(i)]==0){ //더 이상 진입가능한 노드가 없다면
                    que.add(list.get(i)); //진입차수가 0인 노드를 큐에 삽입, 위 과정 반복
                }
            }
        }
        bw.flush();
    }

}
