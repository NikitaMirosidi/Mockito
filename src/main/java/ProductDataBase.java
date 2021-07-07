import java.util.HashMap;
import java.util.Map;

public class ProductDataBase implements DataBase<Character, ProductForProductStore> {

    private Map<Character, ProductForProductStore> productCollection = new HashMap<>();

    public Map<Character, ProductForProductStore> setProductCollection() {

        productCollection.put('a', new ProductForProductStore(1.25f, 3, 3));
        productCollection.put('b', new ProductForProductStore(4.25f));
        productCollection.put('c', new ProductForProductStore(1, 4.25f, 6));
        productCollection.put('d', new ProductForProductStore(0.75f));

        return productCollection;
    }
}