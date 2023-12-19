package algorithm;

import java.util.*;
import java.util.Scanner;

public class dijasktra {
    private static ArrayList<ArrayList<Node>> graph;
    private static class Node{
        int idx;
        int cost;
        Node(int idx, int cost){
            this.idx = idx;
            this.cost = cost;
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int E = scanner.nextInt();
        int start = scanner.nextInt();

        graph =new ArrayList<ArrayList<Node>>();

        //node는 1부터 시작
        for(int i =0; i<V+1; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i<E; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int cost = scanner.nextInt();

            graph.get(a).add(new Node(b,cost));
        }
        //node는 1부터 시작
        boolean [] visited = new boolean[V+1];
        int [] distance  = new int[V+1];

        for(int i =0; i<V+1; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;

        //dijasktra algorithm
        for(int i =0; i<V; i++){
            int nodeValue = Integer.MAX_VALUE;
            int nodeIdx = 0;
            for(int j = 1; j<V+1; j++){
                //1번 노드 기준으로 방문하지 않은 노드 중 최소 비용
                if(!visited[j]&&distance[j]<nodeValue){
                    nodeValue = distance[j];
                    nodeIdx = j;
                }
            }
            //마지막으로 방문한 곳
            visited[nodeIdx] = true;

            //방문한 곳의 인접 노드들 중 최소 비용
            for(int j =0; j<graph.get(nodeIdx).size(); j++){
                Node adj = graph.get(nodeIdx).get(j);
                if(distance[adj.idx]>distance[nodeIdx]+adj.cost){
                    distance[adj.idx] = distance[nodeIdx]+adj.cost;
                }
            }
        }
        for(int i =1; i<V+1; i++){
            if(distance[i]==Integer.MAX_VALUE){
                System.out.println("INF");
            }else{System.out.println(distance[i]);}
        }
        scanner.close();

    }
}
