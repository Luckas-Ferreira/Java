public class Product {
    private String name; 
    private double price;

    public Product(String productName, double productPrice) {
        this.name = productName;
        this.price = productPrice;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
