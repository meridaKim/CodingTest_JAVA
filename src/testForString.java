import java.io.Console;

public class testForString {
    public static int testForString(int a, int b){
    int Str1 = Integer.parseInt(""+a+b);
    int Str2 = Integer.parseInt(""+b+a);
    String str1 = Integer.toString(Str1);
    System.out.println(Str1+Str2);
        return Str1+Str2;
    }

    public static void main(String[] args){
        testForString(10, 20);
    }
}
