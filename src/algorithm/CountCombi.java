package algorithm;

public class CountCombi {
    static int [][] dy;
    public static void main(String [] args){
        dy = new int [50][50];
        System.out.print(combi(5,3));
    }
    public static int combi(int n, int r){
        if(n==r||r==0) return 1;
        if(dy[n][r]>0) return dy[n][r];

        dy[n][r] =combi(n-1,r-1)+combi(n-1,r);
        return dy[n][r];

    }
}
