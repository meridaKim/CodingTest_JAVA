import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<n; i++){
            String binary = Integer.toBinaryString(arr1[i]|arr2[i]);
            binary = String.format("%"+n+"s",binary);
            binary = binary.replace("1","#");
            binary = binary.replace("0"," ");
            list.add(binary);
        }
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}