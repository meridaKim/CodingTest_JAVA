import java.util.Comparator;

public class Car implements Comparator<Car> {
    int price;
    int max_speed;
     Car(int price, int max_speed){
        this.price = price;
        this.max_speed = max_speed;
    }

    @Override
    public int compare(Car o1, Car o2){
        return o1.price - o2.price;
    }

    public static void main(String[] args) {
        Car car1 = new Car(100000,300);
        Car car2 = new Car(200000, 200);
        Car car3 = new Car(300000, 500);
        int result = car1.compare(car1,car2);
        int result2 = car2.compare(car1,car3);
        int result3 = car3.compare(car2,car3);


    }
}
