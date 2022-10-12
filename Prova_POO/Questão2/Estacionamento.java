package Questão2;

//Nessa questão, usamos ArrayList para adicionar os carros/quantidade de pessoas de forma dinâmica.
//Assim sendo possivel listar todos os carros ou ver quantas pessoas existem. 
import java.util.ArrayList;

public class Estacionamento {
    //Chama o objeto ArrayList passando a classe Carro.
    ArrayList<Carro> carros = new ArrayList<>();
    
    //Adicionar um novo carro no ArrayList
    public void estacionar_Carro(Carro carro){
        carros.add(carro);
    }
    
    //Faz a soma de todas as pessoas que estão dentro dos carros.
    public int verQuantidade_Pessoas_Estacionamento(){
        int total_Pessoas = 0; //Armazenar a quantidade de pessoas.
        for (Carro carro : carros){ //Chamada do Enhanced for-loop para percorrer e encontrar o carro na lista. 
            total_Pessoas += carro.getQuantidadePessoa(); //Soma o valor anterior com o novo valor.
        }
        System.out.printf("Tem %d pessoas no estacionamento \n", total_Pessoas); //Mostra todas as pessoas no estacionamento.
        return total_Pessoas;
    }

    //Percorre toda a lista e mostra tudo que tem salva nela.
    public void listar_Carros(){
        for (Carro carro : carros){ //Chamada Enhanced for-loop para percorrer toda a lista.
            System.out.println(carro);
        }
    }
    
}
