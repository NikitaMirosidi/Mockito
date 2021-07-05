import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private Map<Character, Product> productCollection = new HashMap<>();

    public Map<Character, Product> setProductCollection() {

        productCollection.put('a', new Product(1.25f, 3, 3));
        productCollection.put('b', new Product(4.25f));
        productCollection.put('c', new Product(1, 4.25f, 6));
        productCollection.put('d', new Product(0.75f));

        return productCollection;
    }
}