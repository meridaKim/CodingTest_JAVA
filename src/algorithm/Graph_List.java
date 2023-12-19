package algorithm;

import java.util.ArrayList;

class GraphList{
    private ArrayList<ArrayList<Integer>> list;
    public GraphList(int listSize){
        this.list = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<list.size()+1; i++){
            list.add(new ArrayList<Integer>());
        }
    }
    public ArrayList<ArrayList<Integer>> getList(){
        return this.list;
    }
    public ArrayList<Integer> getNode(int i){
        return this.list.get(i);
    }
    public void put(int x, int y){
        list.get(x).add(y);
        list.get(y).add(x);
    }
    public void putSingle(int x, int y){
        list.get(x).add(y);
    }

    public void printGraph(){
        for(int i =1; i<list.size(); i++){
            System.out.println("노드 번호 : "+ i);
            for(int j =0; j<list.get(i).size();j++){
                System.out.print("->"+list.get(i).get(j));
            }System.out.println();
        }
    }
}
public class Graph_List{

    public static void main(String [] args){
        int listSize = 6;
        GraphList graphList = new GraphList(listSize);
        graphList.put(1,2);
        graphList.put(1,3);
        graphList.put(2,3);
        graphList.put(2,4);
        graphList.put(3,4);
        graphList.put(3,5);
        graphList.put(4,5);
        graphList.put(4,6);

        graphList.printGraph();
    }
}
