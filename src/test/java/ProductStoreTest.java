import org.junit.Assert;
import org.junit.Test;

public class ProductStoreTest {

    @Test
    public void GetPriceShouldSuccess1() {

        String test = "ABCDABA";

        Assert.assertEquals(13.25, new ProductStore().getPrice(test),0.001);
    }

    @Test
    public void GetPriceShouldSuccess2() {

        String test = "abcdaba";

        Assert.assertEquals(13.25, new ProductStore().getPrice(test),0.001);
    }

    @Test
    public void GetPriceShouldSuccess3() {

        String test = "f a,@B' c)/d Ж+a.Rb $a ";

        Assert.assertEquals(13.25, new ProductStore().getPrice(test),0.001);
    }

    @Test
    public void GetPriceShouldSuccess4() {

        String test = "";

        Assert.assertEquals(0, new ProductStore().getPrice(test),0.001);
    }

    @Test
    public void GetPriceShouldSuccess5() {

        String test = null;

        Assert.assertEquals(0, new ProductStore().getPrice(test),0.001);
    }
}