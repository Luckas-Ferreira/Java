package controllers;

import java.util.List;

import dto.FilmeDto;
import services.ProdutosService;


public class ProdutosController {
	
	private ProdutosService fs;
	
	public ProdutosController() {
		this.fs = new ProdutosService();
	}
	
	public boolean addFilme(FilmeDto filmeDto) {
		
		if(!filmeDto.validate())
			return false;
		
		return fs.addFilme(filmeDto);		
	}
	
	public List<FilmeDto> listaFilmesPorNome(){
		return fs.listaFilmesPorNome();
	}
	
	
	
	
}
