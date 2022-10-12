package Questão2;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.estacionar_Carro(new Carro("Fiat",4 , 2));
        estacionamento.estacionar_Carro(new Carro("Uno", 4, 4));
        estacionamento.listar_Carros();
        estacionamento.verQuantidade_Pessoas_Estacionamento();
    }
}
