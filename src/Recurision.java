public class Recurision {
    public void print(int count){
        if(count ==0) return;
        else {print(count-1);
        System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Recurision recurision = new Recurision();
        recurision.print(5);



    }
}
