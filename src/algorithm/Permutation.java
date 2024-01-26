package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {
    static boolean [] visited;
    static int countP;
    static int select;
    static int [] selectArr;
    static int sum;
    static int max =0;
    public static void main(String []args){
        int [][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};
        countP = ability.length;
        select = ability[0].length;

        visited = new boolean[countP];
        selectArr = new int[select];
        permu(0,ability);
        System.out.print(max);

    }
    public static void permu(int curIdx, int[][] ability){
        if(select==curIdx){
            sum =0;
            for(int i=0; i<selectArr.length; i++){
                sum+=selectArr[i];
            }
            max = Math.max(sum, max);
            return;
        }
        for(int i=0; i<countP; i++){
            if(visited[i]) continue;
            visited[i] =true;
            selectArr[curIdx] = ability[i][curIdx];
            permu(curIdx+1, ability);
            visited[i] =false;
        }

    }
}
