import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer="";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] letters = letter.split(" ");
        for(String a : letters){
            for(int i =0; i<morse.length; i++){
                if(morse[i].equals(a)){
                 answer+=(char)(97+i);
                }
            }
        }
        
        return answer;
    }
}