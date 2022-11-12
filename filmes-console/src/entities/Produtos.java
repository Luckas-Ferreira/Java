package entities;

import java.util.HashSet;

public class Produtos {
	
	private String nome;
	
	private HashSet<Ator> elenco;
	private float nota;
	
	public Produtos (String nome, HashSet<Ator> elenco, float nota) {
		super();
		this.nome = nome;
		
		this.elenco = new HashSet<Ator>(elenco);
		this.nota = nota;
	}
	
	public Produtos (Produtos produto) {
		this.nome = produto.getNome();
		
		this.elenco = produto.getElenco();
		this.nota = produto.getNota();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public HashSet<Ator> getElenco() {
		return new HashSet<Ator>(this.elenco);
	}

	public void setElenco(HashSet<Ator> elenco) {
		this.elenco = new HashSet<Ator>(elenco);
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
}
