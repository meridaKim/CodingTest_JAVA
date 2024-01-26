package algorithm;
import java.util.Scanner;

public class Combination {
    static int n, m;
    static int[] answer;
    static int [] arr={3,6,9};

    public static void DFS(int level, int j) {
        if (level==m) {
            for (int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i=j; i<n; i++) {
                answer[level] = arr[i];
                DFS(level+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        n = 3;// 구슬 개수
        m = 2; // 뽑는 개수

        answer = new int[m];
        DFS(0, 0);
    }

}