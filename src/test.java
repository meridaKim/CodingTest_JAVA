import java.util.Scanner;

class Solution {
    public static int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++){
            if(n % 2 ==0 && i % 2 ==0){
                System.out.println(i);
                answer += (i*i);
                System.out.println(answer);
            }

            else{
                if(i % 2 !=0){
                    answer += i;
                }
            }

        }
        return answer;
    }
public static void main(String[] args){
        solution(10);

}}