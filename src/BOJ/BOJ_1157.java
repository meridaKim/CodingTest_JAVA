package BOJ;
import java.io.*;
import java.util.*;
public class BOJ_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase(); //문자열을 대문자로 변환
        Map<String, Integer> map = new HashMap<>(); //맵 선언
        List<String> list = new ArrayList<>(); //리스트 선언
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i,i+1);
            map.put(a, map.getOrDefault(a, 0) + 1); //맵에 이미 있으면 그 값을 +1, 없으면 1로 맵에 저장
            max = Math.max(max, map.get(a));
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey()); //알파벳이 가장 많이 사용되었으면 리스트에 추가
        }
        if (list.size() > 1) {
            System.out.print("?"); //리스트에 1개 이상 있으면 ? 출력
        } else {
            System.out.print(list.get(0)); //리스트에 1개만 있으면 그 알파벳 출력
        }

    }
}