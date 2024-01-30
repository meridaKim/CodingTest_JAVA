import java.util.*;

class Solution {

    class Pair {

        String name;
        int remainTime;

        public Pair(String name, int remainTime) {
            this.name = name;
            this.remainTime = remainTime;
        }

    }

    public static int convert(String stringTime) {
        String[] times = stringTime.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }

    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList();

        Arrays.sort(plans, (x, y) -> convert(x[1]) - convert(y[1]));
        Stack<Pair> working = new Stack();

        for(int i = 0; i < plans.length; i++) {

            String name = plans[i][0];
            int nowTime = convert(plans[i][1]);
            int playTime = Integer.parseInt(plans[i][2]);

            
            if (i == plans.length - 1) {
                answer.add(name);
            } else {

                int nextTime = convert(plans[i+1][1]);
                int remainTime = nextTime - nowTime;

                
                working.push(new Pair(name, playTime));

                
                while (!working.isEmpty() && remainTime > 0) {

                    Pair nowWorking = working.pop(); 
                    int played = Math.min(remainTime, nowWorking.remainTime); 

                    
                    if (played == nowWorking.remainTime) {
                        answer.add(nowWorking.name);
                    } else {
                        working.add(new Pair(nowWorking.name, nowWorking.remainTime - played));
                    }
                    remainTime -= played; 
                }
            }

        }

        while (!working.isEmpty()) {
            answer.add(working.pop().name);
        }

        return answer.toArray(String[]::new);
    }
}