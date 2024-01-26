package algorithm;

public class findPartOfSet {
    static int n;
    static int [] ans;
    public static void main(String [] args){
        n = 3;
        ans = new int[n+1];

        dfs(1);
    }
    public static void dfs(int a){
        if(a==n+1){
            String tmp ="";
            for(int i=1; i<=n; i++){
                if(ans[i]==1){
                    tmp+=i+" ";
                }

            }
            if(tmp.length()>0){
                System.out.println(tmp);
            }
        }
        else{
            ans[a]=1;
            dfs(a+1);
            ans[a]=0;
            dfs(a+1);
        }
    }
}
