package Questão1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import Questão1.Produto;
import Questão1.Utilidades;


public class Compras {
	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Produto> itens;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[]args) {
		itens = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
		
	}
	// método menu
	private static void menu() {
		System.out.println("Digite o número da opção desejada:");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Comprar");
		System.out.println("4 - Carrinho");
		System.out.println("5 - Sair");
		
		int opcao = input.nextInt();
		
		//  vai comparar cada um dos casos até achar a operação correta
		switch(opcao) {
			case 1:
				cadastrarProdutos();
				break; // saí do switch
			case 2:
				listarProdutos();
				break;
			case 3:
				comprarProdutos();
				break;
			case 4:
				verCarrinho();
				break;
			case 5:
				System.out.println("Volte sempre!");
				System.exit(0); // para o programa 
			// caso o usuário digite um opção que não elencada	
			default: 
				System.out.println("Opção inválida");
				menu();
				break;
		}
	}
	// Métodos 
	private static void cadastrarProdutos() {
		System.out.println("Nome do produto");
		String nome = input.next();
		
		System.out.println("Preço do produto:");
		double preco = input.nextDouble();
		
		Produto produto = new Produto(nome,preco);
		itens.add(produto);
		
		System.out.println(produto.getNome());
		menu();
	}
	private static void listarProdutos() {
		if(itens.size() > 0) { // se a lista não estiver vazia 
			System.out.println("Lista de produtos\n");
			
			for(Produto p: itens) { // print de todos os itens da lista
				System.out.println(p);
			}
		}else {
			System.out.println("Sem produtos cadastrados!");
		}
		menu();
	}
	private static void comprarProdutos() {
		if(itens.size() > 0) { // se a lista não estiver vazia 
			
			System.out.println("----Produtos Disponíveis----");
			for(Produto p: itens) { // print de todos os itens da lista
				System.out.println(p + "\n");
				
			System.out.println("ID do produto\n:");
			}
			
			int id = Integer.parseInt(input.next()); // pegar o valor digitado
			boolean temNaLista = false; // não tem o produto no carrinho
			
			for(Produto p: itens) {
				if(p.getId() == id) {
					int quantidade = 0;
					try {
						quantidade = carrinho.get(p);
						// checa se o produto está no carrinho,incrementa quantidade
						carrinho.put(p, quantidade +1);
					}catch(NullPointerException e) {
						// se o protudo for o primeiro item no carrinho;
						carrinho.put(p, 1);
					}
					System.out.println(p.getNome()+ "Adicionado ao carrinho!");
					temNaLista = true; // já tem o produto no carrinho 
					
					if(temNaLista) {
						System.out.println("Deseja continuar comprando?");
						System.out.println("Digite 1 para SIM, ou 0 para NÃO\n");
						int opcao = Integer.parseInt(input.next());
						
						if(opcao == 1) {
							comprarProdutos();
						}else {
							finalizarCompra();
						}
					}
						
					
				}else {
					System.out.println("Produto não se encontra na lista!");
					menu();
				}
			}
			
			
		}

	}
	private static void verCarrinho() {
		System.out.println("----Carrinho de compras----");
		if(carrinho.size()>0) {
			for(Produto p : carrinho.keySet()) { // retorna as chaves do Map
				System.out.println("Produto:" + p + "\nQuantidade:" + carrinho.get(p));
			}
		}else {
			System.out.println("Carrinho Vazio");
		}
		
		menu();
	}
	private static void finalizarCompra() {
		double valorProduto = 0.0;
		System.out.println("Produtos comprados");
		
		for(Produto p: carrinho.keySet()) {
			int quantidade = carrinho.get(p);
			valorProduto += p.getPreco() * quantidade;
			System.out.println(p);
		}
		System.out.println("Valor Total:" + Utilidades.doubleToString(valorProduto));
		carrinho.clear(); // quando o produto é comprado ele saí do carrinho
		System.out.println("Compra Finalizada");
		menu();
	}
}
	
