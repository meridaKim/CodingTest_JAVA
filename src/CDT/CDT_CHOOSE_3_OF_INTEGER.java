package CDT;
import java.util.*;
public class CDT_CHOOSE_3_OF_INTEGER {

        public static final int MAX_N = 100;
        public static final int INF = 10000000;

        public static int num, target;
        public static int goal = -1, sum = 0;

        // 최솟값을 구하므로, 매우 큰 값으로 초기화합니다.
        public static int minDiff = INF;

        public static int[] arr = new int[MAX_N];

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 카드의 개수와 목표 합을 입력받습니다.
            num = sc.nextInt();
            target = sc.nextInt();

            for(int i = 0; i < num; i++)
                arr[i] = sc.nextInt();

            // 세 카드의 합이 target과 가장 가까운 경우를 찾습니다.
            for(int i = 0; i < num; i++) {
                for(int j = i + 1; j < num; j++) {
                    for(int k = j + 1; k < num; k++) {
                        sum = arr[i] + arr[j] + arr[k];

                        // 세 카드의 합이 지금까지의 답과 비교했을 때 target과 더 가깝다면,
                        // 답을 갱신합니다.
                        if(target - sum < minDiff && target - sum >= 0) {
                            minDiff = target - sum;
                            goal = sum;
                        }
                    }
                }
            }

            // 결과를 출력합니다.
            System.out.println(goal);
        }
    }

