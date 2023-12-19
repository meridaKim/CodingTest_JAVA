public class superTest {
    void show() {System.out.println("parent");}
}

class Child extends superTest{
    void show() {
        System.out.println("Child");
    }
}

 class Test{
    public static void main(String[] args){
        superTest su = new Child();
        su.show();
    }

}