public class Person implements Comparable<Person> {
    int age;
    int month;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    Person (int age, int month){
        this.age = age;
        this.month = month;
    }

    public static void main(String[] args) {
        Person p1 = new Person(10,3);
        Person p2 = new Person(30,2);
        int result = p1.compareTo(p2);

        if(result>0){
            System.out.println("p1이 더 크다.");
        } else if (result==0) {
            System.out.println("p1과 같다");
        }else {
            System.out.println("p2가 더 크다.");
        }
    }
}
