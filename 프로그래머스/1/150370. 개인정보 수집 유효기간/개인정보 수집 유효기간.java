import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int k =0; k<terms.length; k++){
            String [] now = today.split("\\.");
            String [] term = terms[k].split(" ");
            String target = term[0];
            int t = convert(term[1]);
            for(int i=0; i<privacies.length; i++){
                privacies[i]=privacies[i].replaceAll("\\."," ");
                String [] arr = privacies[i].split(" ");
                if(arr[3].equals(target)){
                    int year = convert(arr[0]);
                    int now_year = convert(now[0]);
                    int end = calculate(t,convert(arr[1]), convert(arr[2]));
                    int n = calculate(0,convert(now[1]),convert(now[2]));
                    end = end+year*12*28;
                    n = n+now_year*12*28;
                    if(n>=end) list.add(i+1);
                }
               
        }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
    public static int convert(String str){
        return Integer.parseInt(str);
    }
    public static int calculate(int t, int month, int day){
        return (t+month)*28+day;
    }
}