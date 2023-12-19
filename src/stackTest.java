import java.util.*;
public class stackTest {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        ArrayList<Integer> lista = new ArrayList<>();
        Stack<Integer> intStack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.remove(3);
        stack.add("b");
        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());
        System.out.println(stack.indexOf("a"));
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        for(String str: stack)
            list.add(str + "");
        System.out.println(list);

        for(int inter : intStack){
            lista.add(inter);
        }
        System.out.println(lista);
    }
}
