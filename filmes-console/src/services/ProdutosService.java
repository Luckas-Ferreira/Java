package services;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;

import dto.FilmeDto;

import entities.Produtos;

import repositories.ProdutosRepository;


public class ProdutosService {
	
	private ProdutosRepository fr;
	
	
	public ProdutosService() {
		this.fr = new  ProdutosRepository();
		
	}
	
	public boolean addFilme(String nome, 
			String[] elenco, float nota) {
		
		// Adicione diretor na lista de diretores
		
		
		
		Produtos produtos = new Produtos(nome, null, nota);
		
		return fr.addFilme(produtos);
	}
	
	public boolean addFilme(FilmeDto filmeDto) {
		return this.addFilme(filmeDto.getNome(),
				filmeDto.getElenco(), filmeDto.getNota());
	}
	
	public List<FilmeDto> listaFilmesPorNome(){
		List<Produtos> filmesFiltrados = new ArrayList<Produtos>(
				this.fr.getFilmes() );
		
		filmesFiltrados.sort((o1, o2) -> {
				return o1.getNome().compareTo(o2.getNome());
		});
		return null;
		
		//return converteListaFilmeParaDto(filmesFiltrados);
	}

		

	
		
	
	
	public List<FilmeDto> listaFilmesPorNota(float nota){
		ArrayList<Produtos> filmesFiltrados = new ArrayList<Produtos>();
		
		HashSet<Produtos> produtos = this.fr.getFilmes();
		
		for(Produtos f : produtos) {
			if(f.getNota() >= nota)
				filmesFiltrados.add(f);
		}
		
		return converteListaFilmeParaDto(filmesFiltrados);
	}

	private List<FilmeDto> converteListaFilmeParaDto(ArrayList<Produtos> filmesFiltrados) {
		return null;
	}
	
	
	
	
	

	
	
}
