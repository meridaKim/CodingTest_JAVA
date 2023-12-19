import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] array = a.split("");
        String result ="";
        for (int i = 0; i< array.length; i++){
            if (!array[i].equals(array[i].toLowerCase()))
                array[i]=array[i].toLowerCase();
            else {
                array[i]=array[i].toUpperCase();
            }

            result += array[i];
        }
        System.out.println(result);
        }
    }
