import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    float price = 1.25f;
    float promotionalPrice = 3;
    int promotionalQuantity = 3;
    Product product = new Product(price, promotionalPrice, promotionalQuantity);

    @Test
    public void getPrice() {

        int quantity1 = 2;
        int quantity2 = 3;
        int quantity3 = 4;

        Assert.assertEquals(2.5, product.getPrice(quantity1),0);
        Assert.assertEquals(3, product.getPrice(quantity2),0);
        Assert.assertEquals(4.25, product.getPrice(quantity3),0);
    }
}