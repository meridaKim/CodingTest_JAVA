import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        ArrayList<Integer> list = new ArrayList<>();
        char [][] a = new char[wallpaper.length][wallpaper[0].length()];
        for(int i=0; i<wallpaper.length; i++){
            for(int j =0; j<wallpaper[0].length(); j++){
                a[i][j] = wallpaper[i].charAt(j);
            }
        }
        int minR = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            for(int j =0; j<a[i].length; j++){
                if(a[i][j]=='#'){
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j+1);
                    maxR = Math.max(maxR, i+1);
                    minR = Math.min(minR, i);
                }
            }
        }
        
        
        for(int i=0; i<a[0].length; i++){
            for(int j =0; j<a.length; j++){
               if(a[j][i]=='#'){
                    
                   if(minR<0) minR =0;
                    
                }
            }
        }
        list.add(minR);
        list.add(minC);
        list.add(maxR);
        list.add(maxC);
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}