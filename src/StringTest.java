public class StringTest {
    public static void main(String[] args){
        String str = "대리 : 김철수, 부장 : 김영희";
        String target = "대리";
        int target_num = str.indexOf(target);
        System.out.println(target_num);
        String result= str.substring(target_num, (str.substring(target_num).indexOf(",")));
        System.out.println(result+"님");
    }
}
