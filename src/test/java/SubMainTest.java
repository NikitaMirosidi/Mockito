import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class SubMainTest {

    public ProductStore productStore = Mockito.mock(ProductStore.class);

    @Test
    public void storeShouldSuccess1() {
        String test = "ABCDABA";
        Mockito.when(productStore.getPrice(Mockito.anyString())).thenReturn(test.hashCode() * 0.1f);

        Assert.assertEquals(Float.class, Float.valueOf(productStore.getPrice(test)).getClass());

        Mockito.verify(productStore, Mockito.times(1)).getPrice(Mockito.anyString());
        Mockito.verifyNoMoreInteractions(productStore);
    }

    @Test
    public void storeShouldSuccess2() {
        String test = "dgslzkglkwgphertfgh43t0243t+-r235>";
        Mockito.when(productStore.getPrice(Mockito.anyString())).thenReturn(test.hashCode() * 0.1f);

        Assert.assertEquals(Float.class, Float.valueOf(productStore.getPrice(test)).getClass());

        Mockito.verify(productStore, Mockito.times(1)).getPrice(Mockito.anyString());
        Mockito.verifyNoMoreInteractions(productStore);
    }
}