import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<arr.length; i++){
            if(!stack.isEmpty()){
            if(arr[i]==stack.peek()) stack.pop();
            else stack.add(arr[i]);
            }else stack.add(arr[i]);
            
        }
        if(stack.isEmpty()) stack.add(-1);
        return stack.stream().mapToInt(i->i).toArray();
    }
}