package questao1;

public class Main {
	
	public static void main(String[] args) {
		Compra compra = new Compra();
		
		Produto product1 = new Produto("Feijão",5.50);
		Produto product2 = new Produto("Arroz",3.99);
		Produto product3 = new Produto("Café",7.00);
		Produto product4 = new Produto("Óleo de cozinha",9.60);
		
		Itens item1 = new Itens(5.50,product1,2);
		Itens item2 = new Itens(3.99,product2,4);
		Itens item3 = new Itens(7.00,product3,5);
		Itens item4 = new Itens(9.60,product4,1);
		
		compra.addItem(item1);
		compra.addItem(item2);
		compra.addItem(item3);
		compra.addItem(item4);
		
		System.out.println(compra);
	 
	}
}




