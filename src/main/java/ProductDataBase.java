import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductDataBase implements DataBase<Character, Product> {

    private Map<Character, Product> productCollection = new HashMap<>();

    public Map<Character, Product> setProductCollection() {

        productCollection.put('a', new Product1(1.25f, 3, 3));
        productCollection.put('b', new Product1(4.25f));
        productCollection.put('c', new Product1(1, 4.25f, 6));
        productCollection.put('d', new Product1(0.75f));

        return productCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDataBase that = (ProductDataBase) o;
        return Objects.equals(productCollection, that.productCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCollection);
    }
}