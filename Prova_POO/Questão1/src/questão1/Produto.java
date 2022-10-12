package Questão1;

import Questão1.Utilidades;

public class Produto {
	// contador -> conta a quantidade de produtos no carrinho
     private static int count = 1;
     private int id;
     private String nome;
     private Double preco;
     
     public Produto(String nome, double preco) {
        this.id = count;
        this.nome = nome;
        this.preco = preco;
        Produto.count += 1;

   }
     // identificação
     public int getId() {
    	 return id;
     }
     public void setId(int id) {
    	 this.id = id;
     }
     // Nome produto
     public String getNome() {
    	 return nome;
     }
     public void setNome(String nome) {
    	 this.nome = nome;
     }
     // Preço produto
     public double getPreco() {
    	 return preco;
     }
     public void setPreco(double preco) {
    	 this.preco = preco;
     }
     
     @Override
     public String toString() {
         return "[ID: " + this.getId() +  "\nNome:" + this.getNome() + "\nPreço:" + Utilidades.doubleToString(this.getPreco());
     }
}
