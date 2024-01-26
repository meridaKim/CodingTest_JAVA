package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
    public static void main(String [] args){
//        TreeMap<String, Integer> map= new TreeMap<>();
//        map.put("b",1);
//        map.put("a",1);
//        map.put("c",1);
//        for(String key : map.keySet()){
//            System.out.print(key+" "+map.get(key));
//        }
        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");
        set.add("c");
        ArrayList<String> list =new ArrayList<>(set);
        Collections.sort(list, (o1,o2)->o2.compareTo(o1));
        System.out.print(list.toString());
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
