package Questão2;

public abstract class Estacionamento {
    private String carro;
    private int capacidadePessoas;
    private int quantidadePessoas;

    public Estacionamento(String nome, int capacidadePessoas, int quantidadePessoas){
        this.carro = nome;
        this.capacidadePessoas = capacidadePessoas;
        if (quantidadePessoas <= this.getCapacidadePessoas()){
            this.quantidadePessoas = quantidadePessoas;
        }else{
            this.quantidadePessoas = this.getCapacidadePessoas();
            System.out.printf("Quantidade maxima de pessoas exedida. O carro tem %d lugares.\n", this.getCapacidadePessoas());
            System.out.printf("Foram adicionadas apenas %d pessoas no carro %S \n", this.getCapacidadePessoas(), this.getCarro());
        }
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public String toString() {
        return "Carro: " + carro + ", Capacidade de Pessoas: " + capacidadePessoas + ", Quantidade de Pessoas: "
                + quantidadePessoas;
    }
}
