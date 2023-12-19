import java.util.Scanner;

class solution {
    public static String solution(String str1, String str2) {
        String[] arr1 = str1.split("");
        String[] arr2 =str2.split("");
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
                answer+= arr1[i/2]+arr2[i/2];
                }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[]args){
        solution("aaaa","bbbb");
        solution("aaaaa", "bbbbb");

    }}



