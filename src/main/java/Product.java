public class Product {
    private float price;
    private float promotionalPrice;
    private int promotionalQuantity;

    public Product(float price, float promotionalPrice, int promotionalQuantity) {
        this.price = price;
        this.promotionalPrice = promotionalPrice;
        this.promotionalQuantity = promotionalQuantity;
    }

    public float cost(int quantity) {
        float cost;
        if (quantity < promotionalQuantity) {
            cost = price * quantity;
        }
        else {
            cost =(quantity / promotionalQuantity) * promotionalPrice + (quantity % promotionalQuantity) * price;
        }
        return cost;
    }
}