package algorithm;

class ArrGraph{
    private int [][] graph;
    public ArrGraph(int arrSize){
        this.graph = new int[arrSize+1][arrSize+1];
    }
    public int [][] getGraph(){
        return this.graph;
    }
    public void put(int x, int y){
        graph[x][y] = graph[y][x] = 1;
    }
    public void putSingle(int x, int y){
        graph[x][y] = 1;
    }
    public void printGraph(){
        for(int i =0; i<graph.length; i++){
            for(int j =0; j<graph[i].length; j++){
                System.out.print(" "+graph[i][j]);
            }
            System.out.println();
        }
    }
}
public class Graph_Array {
    public static void main(String [] args){
        int size = 6;
        ArrGraph arrGraph = new ArrGraph(size);

        arrGraph.put(1,2);
        arrGraph.put(1,3);
        arrGraph.put(2,3);
        arrGraph.put(2,4);
        arrGraph.put(3,4);
        arrGraph.put(3,5);
        arrGraph.put(4,5);
        arrGraph.put(4,6);

        arrGraph.printGraph();

    }
}
