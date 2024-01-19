package marketplace;

import java.util.List;

public class Cart {
    private Long cartId;

    private List<Product> productList;

    void makeList(Product product, int quan){
        productList.add(product);
    }
}
