import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Store {
    private Map<Character, Product> productCollection = new HashMap<>();
    private Map<Character, Integer> tempProductCollection = new HashMap<>();
    private float price = 0;

    public float getPrice(String basket) {
        setProductCollection();
        char[] basketArr = basket.toLowerCase().toCharArray();

        for (char product : basketArr) {
            if (tempProductCollection.containsKey(product)) {
                tempProductCollection.put(product, tempProductCollection.get(product) + 1);
            }
            else {
                tempProductCollection.put(product, 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iterator = tempProductCollection.entrySet().iterator();

        while(iterator.hasNext()) {
            char key = iterator.next().getKey();
            int value = tempProductCollection.get(key);

            if (productCollection.containsKey(key)) {
                price += productCollection.get(key).cost(value);
            }
        }

        return price;
    }

    private void setProductCollection() {
        productCollection.put('a', new Product(1.25f, 3, 3));
        productCollection.put('b', new Product(4.25f, 4.25f, 1));
        productCollection.put('c', new Product(1, 5, 6));
        productCollection.put('d', new Product(0.75f, 0.75f, 1));
    }
}