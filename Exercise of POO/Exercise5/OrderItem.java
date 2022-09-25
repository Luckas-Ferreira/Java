package Exercise5;

import exerc5.Product;

public class OrderItem {
    private int quality;
    private double price;

    public OrderItem(int quantity, double productPrice, Product){
        this.quality = quantity;
        this.price = productPrice;
        this.Product = productPrice;
    }
    public double subTotal(){
        return 0;
    }
    public double getPrice() {
        return price;
    }
    public int getQuality() {
        return quality;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
}
