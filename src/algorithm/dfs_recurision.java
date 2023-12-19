//import java.util.LinkedList;
//
//public class dfs_recurision {
//    public static LinkedList<Integer> nodeList = new LinkedList<>();
//    public void dfs_recurision(int node, boolean[] visited){
//        /**
//         * 1) 탐색하려는 노드가 탐색을 이미 한 노드인지 확인하고
//         *
//         * 2) 탐색하려는 노드의 자식노드들을 확인한다.
//         *
//         * 3) 자식노드가 없으면 탐색은 종료되고
//         *
//         * 4) 자식노드가 있으면 자식노드를 같은 방식으로 탐색한다.
//         */
//        if(visited[node]) return;
//        visited[node] = true;
//
//        for(int nextNode : nodeList[node]){
//            dfs_recurision(nextNode, visited,node);
//        }
//    }
//}
