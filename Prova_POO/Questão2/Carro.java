package Questão2;

public class Carro {
    //Atributos usados.
    protected String modelo;
    protected int    capacidadeMaxima;
    protected int    quantidadePessoa;
    
    //Construtor salva as informações nos atributos.
    public Carro(String modelo, int capacidadeMaxima, int quantidadePessoa){
        if (quantidadePessoa <= capacidadeMaxima){//Só será adicionado caso a quantidade de pessas seja menor ou igual a capacidade do carro.
            this.modelo = modelo;
            this.capacidadeMaxima = capacidadeMaxima;
            this.quantidadePessoa = quantidadePessoa;
        }else{ //Caso a primeira condição não seja atendida, retorna uma frase.
            System.out.printf("Não é permitido mais que: %d pessoas no carro.", capacidadeMaxima);
        }
    }

    //Getters and Setters dos atributos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadePessoa() {
        return capacidadeMaxima;
    }

    public void setCapacidadePessoa(int capacidadePessoa) {
        this.capacidadeMaxima = capacidadePessoa;
    }

    public int getQuantidadePessoa() {
        return quantidadePessoa;
    }

    public void setQuantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }

    //Mostra as informações na tela.
    @Override
    public String toString() {
        return "Carro: " + modelo + ", capacidade maxima: " + capacidadeMaxima + ", quantidade de pessoa: "
                + quantidadePessoa;
    }
}
