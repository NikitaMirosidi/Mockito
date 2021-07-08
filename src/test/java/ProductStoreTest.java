import org.junit.Assert;
import org.junit.Test;

public class ProductStoreTest {

    public Store store = new ProductStore();

    @Test
    public void shouldSuccessGetPriceWithStringInUpperCase() {

        String test = "ABCDABA";

        Assert.assertEquals(13.25, store.getPrice(test),0.001);
    }

    @Test
    public void shouldSuccessGetPriceWithStringInLowerCase() {

        String test = "abcdaba";

        Assert.assertEquals(13.25, store.getPrice(test),0.001);
    }

    @Test
    public void shouldSuccessGetPriceWithRandomChars() {

        String test = "f a,@B' c)/d Ж+a.Rb $a ";

        Assert.assertEquals(13.25, store.getPrice(test),0.001);
    }

    @Test
    public void shouldReturnZeroWithEmptyString() {

        String test = "";

        Assert.assertEquals(0, store.getPrice(test),0.001);
    }

    @Test
    public void shouldReturnZeroWithUnknownProduct() {

        String test = "GJTXLRU";

        Assert.assertEquals(0, store.getPrice(test),0.001);
    }

    @Test
    public void shouldReturnZeroWithNull() {

        String test = null;

        Assert.assertEquals(0, store.getPrice(test),0.001);
    }
}