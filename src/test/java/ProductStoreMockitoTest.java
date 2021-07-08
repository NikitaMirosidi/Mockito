import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ProductStoreMockitoTest {

    public ProductStore productStore = Mockito.mock(ProductStore.class);
    public String test = "";

    {
        Mockito.when(productStore.getPrice(test)).thenReturn(test.hashCode() * 0.1f);
    }

    @Test
    public void shouldGetPriceReturnSomeSpecificFloatForAnyString1() {

        test = "ABCDABA";

        Assert.assertEquals(Float.class, Float.valueOf(productStore.getPrice(test)).getClass());

        Mockito.verify(productStore, Mockito.times(1)).getPrice(Mockito.anyString());
        Mockito.verifyNoMoreInteractions(productStore);
    }

    @Test
    public void shouldGetPriceReturnSomeSpecificFloatForAnyString2() {

        test = "dgslzkglkwgphertfgh43t0243t+-r235>";

        Assert.assertEquals(Float.class, Float.valueOf(productStore.getPrice(test)).getClass());

        Mockito.verify(productStore, Mockito.times(1)).getPrice(Mockito.anyString());
        Mockito.verifyNoMoreInteractions(productStore);
    }
}