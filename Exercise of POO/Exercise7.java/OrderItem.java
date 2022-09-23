package exerc5;

public class OrderItem {
  private int quantity;
  private double price;
  Product product;

  public OrderItem(int quantity, double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public double subTotal() {
    return getQuantity() * price;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return String.format("%s, %s, Quantity: %s, Subtotal: $%s\n", product.getName(), product.getName(),
        product.getPrice(), getQuantity(), subTotal());
  }
}