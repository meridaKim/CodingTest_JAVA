package marketplace;

import java.time.LocalDateTime;
import java.util.Date;

public class Product {
    private String name;
    private int price;
    private LocalDateTime expireDate;

    public Product(String name, int price, LocalDateTime expireDate) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
    }
}
