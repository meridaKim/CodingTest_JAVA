import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i],i);
        }
        for(String call : callings){
            int idx = map.get(call);
            int change = map.get(call)-1;
            String str = players[change];
            map.replace(str, idx);
            players[idx] = players[change];
            map.replace(call,change);
            players[change] =call;
        }
        return players;
    }
}