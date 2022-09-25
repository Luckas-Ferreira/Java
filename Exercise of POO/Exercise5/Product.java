package Exercise5;

public class Product {
    private String name;
    private double price;

    public Product (String nameProduto, double priceProduto){
        this.name = nameProduto;
        this.price = priceProduto;
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
