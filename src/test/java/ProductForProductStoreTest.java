import org.junit.Assert;
import org.junit.Test;

public class ProductForProductStoreTest {
    float price = 1.25f;
    float promotionalPrice = 3;
    int promotionalQuantity = 3;
    ProductForProductStore product = new ProductForProductStore(price, promotionalPrice, promotionalQuantity);

    @Test
    public void GetPriceShouldSuccess1() {

        int testQuantity = 2;

        Assert.assertEquals(2.5, product.getPrice(testQuantity),0);
    }

    @Test
    public void GetPriceShouldSuccess2() {

        int testQuantity = 3;

        Assert.assertEquals(3, product.getPrice(testQuantity),0);
    }

    @Test
    public void GetPriceShouldSuccess3() {

        int testQuantity = 4;

        Assert.assertEquals(4.25, product.getPrice(testQuantity),0);
    }
}