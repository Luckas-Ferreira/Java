package questao1;

public class Itens {
	private Double price;
	private Produto product;
	private Integer quantify;
	
	public Itens(Double price,Produto product,Integer quantify) {
		this.price = price;
		this.product = product;
		this.quantify = quantify;
	
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
		
	}
	public Produto getProduct() {
		return product;	
	}
	public void setProduct(Produto product) {
		this.product = product;
		
	}
	public Integer getQuantify() {
		return quantify;
	}
	public void setQuantify(Integer quantify) {
		this.quantify = quantify;
	}
	
	public double subTotal() {
		return price * quantify;
	}
	
	public String toString() {
		return product.getName() + ".$" + String.format("%.2f", price + "Quantidade" + quantify);
		}
	}
	
