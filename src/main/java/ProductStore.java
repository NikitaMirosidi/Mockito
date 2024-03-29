import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProductStore implements Store{

    private Map<Character, Product> productCollection = new HashMap<>();
    private Map<Character, Integer> tempProductCollection = new HashMap<>();

    public float getPrice(String basket) {

        getDataFromDataBase();

        setTempProductCollection(basket);

        return calculatePrice();
    }

    private void getDataFromDataBase() {

        if (productCollection.isEmpty()) {
            DataBase<Character, Product> dataBase = new ProductDataBase();
            productCollection = dataBase.setProductCollection();
        }
    }

    private void setTempProductCollection(String basket) {

        try {
            char[] basketArr = basket.toLowerCase().toCharArray();

            for (char product : basketArr) {
                if (tempProductCollection.containsKey(product)) {
                    tempProductCollection.put(product, tempProductCollection.get(product) + 1);
                } else {
                    tempProductCollection.put(product, 1);
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Передан null! Будет возвращенна цена пустой корзины - \"0\"");
        }
    }

    private float calculatePrice () {

        float price = 0;
        Iterator<Map.Entry<Character, Integer>> iterator = tempProductCollection.entrySet().iterator();

        while(iterator.hasNext()) {

            char key = iterator.next().getKey();
            int value = tempProductCollection.get(key);

            if (productCollection.containsKey(key)) {
                price += productCollection.get(key).getPrice(value);
            }
        }

        tempProductCollection.clear();
        return price;
    }
}