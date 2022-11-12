package repositories;

import java.util.HashSet;

import entities.Produtos;



public class ProdutosRepository {

	private HashSet<Produtos>produtos;
	
	public ProdutosRepository() {
		this.produtos = new HashSet<Produtos>();
	}
	
	public boolean addFilme(Produtos filme) {	
		return this.produtos.add(filme);
	}
	
	public boolean removeFilme(Produtos produtos) {
		return this.produtos.remove(produtos);
	}
	
	public HashSet<Produtos> getFilmes(){
		return new HashSet<Produtos>(this.produtos);
	}
}
