package marketplace;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mart {
    public static void main(String [] args){
        Customer customer = new Customer();
        MartOwner martOwner = new MartOwner();
        Product ramen = new Product("라면",1200, LocalDateTime.now());
        Product cola = new Product("콜라", 1500, LocalDateTime.now());
    }
}
