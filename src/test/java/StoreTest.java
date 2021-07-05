import org.junit.Assert;
import org.junit.Test;

public class StoreTest {

    @Test
    public void testGetPrice() {
        String test1 = "ABCDABA";
        String test2 = "abcdaba";
        String test3 = "f a,@B' c)/d Ж+a.Rb $a ";
        String test4 = "";

        Assert.assertEquals(13.25, new Store().getPrice(test1),0);
        Assert.assertEquals(13.25, new Store().getPrice(test2),0);
        Assert.assertEquals(13.25, new Store().getPrice(test3),0);
        Assert.assertEquals(0, new Store().getPrice(test4),0);
    }
}