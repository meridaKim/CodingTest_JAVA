import java.util.*;
import java.io.*;
public class Main {
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str;
        while((str=br.readLine())!=null){
            int lower =0;
            int upper =0;
            int num =0;
            int blank =0;
            for(int i =0; i<str.length(); i++){
                char a = str.charAt(i);
                if(a>='A'&&a<='Z') upper++;
                if(a>='a'&&a<='z') lower++;
                if(a>='0'&&a<='9') num++;
                if(a==' ') blank++;
            }
            sb.append(lower+" "+upper+" "+num+" "+blank+"\n");
        }
        System.out.println(sb);
    }
}
