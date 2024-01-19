package algorithm;

import java.util.*;

public class Sort {
    public static void main(String [] args){
        Integer [] arr = {4,6,2,3,1};
        String [] str = {"ac","sa","ag"};
        Arrays.sort(str);
        List strlist = Arrays.asList(str);
        Collections.sort(strlist);
        Collections.reverse(strlist);

        List list = Arrays.asList(arr);
        int [] arr2 = {2,8,3,7,1};
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        Character [] chr = {'a','z','s'};
        Arrays.sort(chr);
        for(int i =0; i<chr.length; i++){
            System.out.print(chr[i]+" ");
        }
        //먼저 오름차순 정렬을 수행한다.
        Arrays.sort(chr,Collections.reverseOrder());
        for(int i =0; i<chr.length; i++){
            System.out.print(chr[i]+" ");
        }
        int [] brr = list.stream().mapToInt(i-> (int) i).toArray();
        List<String> strList = new ArrayList<>();
        strList = Arrays.asList(str);
        String [] strr2 = strList.toArray(new String[0]);
        String [] strr = strList.stream().toArray(String[] ::new);

        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(5);
        queue.add(1);
        queue.add(88);
        queue.add(8);

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        que.add(3);
        que.add(5);
        que.add(1);
        que.add(88);
        que.add(8);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
        while(!que.isEmpty()){
            System.out.print(que.poll()+" ");
        }
//        Person mom = new Person(31,"msKim");
//        Person dad = new Person(32,"mrKim");
//        Person sister = new Person(3,"yuni");
//        Person me = new Person(27,"zanie");
//        Person [] fam = new Person[4];
//        fam[0] = mom;
//        fam[1] = dad;
//        fam[2] = sister;
//        fam[3] = me;
//        Arrays.sort(fam, Comparator.comparingInt(Person::getAge).reversed());
//        for(Person p : fam){
//            System.out.print(p.name+" : "+p.age);
//            System.out.println();
//        }
        Student st1 = new Student(2017, "sujin");
        Student st2 = new Student(2019,"alien");
        Student st3 = new Student(2015, "bily");

        Student [] students = new Student[3];
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        List <Student> studentlist = Arrays.asList(students);
        Collections.sort(studentlist);
        Student [] dsc = studentlist.toArray(new Student[studentlist.size()]);
        for(int i =0; i<dsc.length; i++){
            System.out.println(dsc[i].studentID+" : "+dsc[i].name);
        }

        int[][] intrr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10}};
        Arrays.sort(intrr, Comparator.comparingInt((int[] o) -> o[0]));	//첫 번째 숫자 기준 오름차순 정렬
        Arrays.sort(intrr, Comparator.comparingInt((int[] o) -> o[1]));	//두 번째 숫자 기준 오름차순 정렬

        Arrays.sort(intrr, Comparator.comparingInt((int[] o) -> o[0]).reversed());	//첫 번째 숫자 기준 내림차순 정렬
        Arrays.sort(intrr, Comparator.comparingInt((int[] o) -> o[1]).reversed());	//두 번째 숫자 기준 내림차순 정렬
    }
    }

//    private static class Person {
//        int age;
//        String name;
//        Person(int age, String name){
//            this.age = age;
//            this.name= name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//    }


class Student implements Comparable<Student>{
    int studentID;
    String name;
    public int compareTo(Student s1){
        return this.name.compareTo(s1.name);
    }
    Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }
}
