import org.junit.Assert;
import org.junit.Test;

public class StoreTest {

    @Test
    public void getPrice() {
        String test = "ABCDABA";
        Assert.assertEquals(13.25, new Store().getPrice(test),0);
    }
}