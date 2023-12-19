import java.util.Scanner;

class replaceTest {
    public static String replaceTest(String my_string, String overwrite_string, int s){
        String answer = "";
        int a = my_string.length() - overwrite_string.length();
        int last_id= a-s;
        if(last_id<0){
            answer = my_string.substring(s,overwrite_string.length()+a);
            my_string = my_string.replace(answer, overwrite_string);
        }
        else {
            answer = my_string.substring(s,overwrite_string.length()+s);
            my_string = my_string.replace(answer, overwrite_string);
        }
        answer = my_string;
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        replaceTest("He11oWor1d", "lloWorl",2);
        replaceTest("Program29b8UYP", "merS123", 7);
        replaceTest("sujin123", "kim",5);
    }

}

