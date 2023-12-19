package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
/**
 * 숨바꼭질*/
public class BOJ_1697 {

    static int n;
    static int k;
    static int check[]; // 방문여부 배열
    static int count;

    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        check = new int [100001]; // 수빈이와 동생이 위치할 수 있는 범위는 0 ~ 100,000이다.


        if(n==k) { // 만약 수빈이와 동생의 위치가 같다면 이동할 필요가 없다.
            System.out.println("0"); // 이 부분에서 오답처리를 받았다. 예외의 경우를 항상 생각하자.
            return;
        }
        bfs(n,k); // bfs로 수빈이와 동생의 위치를 전달한다.

        System.out.println(check[k]);
    }


    public static void bfs(int a,int k) { //BFS메소드, 수빈이의 위치와 동생의 위치를 전달
        Queue<Integer> queue = new LinkedList();

        check[a] = 0; // 수빈이의 위치를 0으로 초기화
        queue.offer(a);

        while(!queue.isEmpty()) { //큐가 빌 때 까지 반복한다.
            int x = queue.poll();
            if(check[k]!=0) break; // 그러나 동생의 위치값이 0이 아니면 이미 최솟값을 찾은 것이므로 벗어난다.
            // 배열의 크기를 100,001로 해서 시간을 조금이라도 단축시키기 위함
            if((x-1>=0) && check[x-1]==0) { // 이 부분에서 많은 분들이 런타임 에러가 많이 발생하는 것 같다.
                queue.offer(x-1);  			// 조건부의 x범위를 먼저 확인해줘야 뒤에 배열 인덱스를 참조할 때 범위를 벗어나지 않는다.
                check[x-1] = check[x]+1;
            }
            if((x<check.length-1)&&check[x+1]==0) {
                queue.offer(x+1);
                check[x+1] = check[x]+1;
            }
            if((x*2<check.length)&&check[2*x]==0) {
                queue.offer(2*x);
                check[2*x] = check[x]+1;
            }

        }
    }
}
