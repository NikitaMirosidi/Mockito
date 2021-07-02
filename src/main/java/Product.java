public class Product {
    private final float PRICE;
    private final float PROMOTIONAL_PRICE;
    private final int PROMOTIONAL_QUANTITY;

    public Product(float price, float promotionalPrice, int promotionalQuantity) {
        this.PRICE = price;
        this.PROMOTIONAL_PRICE = promotionalPrice;
        this.PROMOTIONAL_QUANTITY = promotionalQuantity;
    }

    public float getPrice(int quantity) {
        float cost;
        if (quantity < PROMOTIONAL_QUANTITY) {
            cost = PRICE * quantity;
        }
        else {
            cost =(float)(quantity / PROMOTIONAL_QUANTITY) * PROMOTIONAL_PRICE + (quantity % PROMOTIONAL_QUANTITY) * PRICE;
        }
        return cost;
    }
}