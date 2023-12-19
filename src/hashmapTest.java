import java.util.*;
import java.lang.*;
import java.util.HashMap;
public class hashmapTest {
        public static int hashmapTest(int[] nums) {

            int answer = 0;
            int n = nums.length/2;
            HashMap map=new HashMap<>();
            for(int i =0; i<nums.length; i++){
                map.put(nums[i],i+1);
            }
            for(Object x : map.keySet()){
                answer = Math.min(n, map.size());
            }
            return answer;
        }
        public static void main(String args[]){
            hashmapTest(new int[]{1234});
        }
    }

