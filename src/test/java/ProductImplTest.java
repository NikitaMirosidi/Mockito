import org.junit.Assert;
import org.junit.Test;

public class ProductImplTest {

    float price = 1.25f;
    float promotionalPrice = 3;
    int promotionalQuantity = 3;
    Product product = new ProductImpl(price, promotionalPrice, promotionalQuantity);

    @Test
    public void shouldSuccessGetPriceWithQuantityBelowPromotionalQuantity() {

        int testQuantity = 2;

        Assert.assertEquals(2.5, product.getPrice(testQuantity),0);
    }

    @Test
    public void shouldSuccessGetPriceWithQuantityEqualsPromotionalQuantity() {

        int testQuantity = 3;

        Assert.assertEquals(3, product.getPrice(testQuantity),0);
    }

    @Test
    public void shouldSuccessGetPriceWithQuantityAbovePromotionalQuantity() {

        int testQuantity = 4;

        Assert.assertEquals(4.25, product.getPrice(testQuantity),0);
    }
}