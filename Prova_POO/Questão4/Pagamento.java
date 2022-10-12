package Questão4;

public class Pagamento {
    //Cria um atributo da classe Metodo_de_Pagamento.
    Metodo_de_Pagamento novo_metodo_de_Pagamento;

    //Contruto adicionar recebe um método de pagemento.
    public Pagamento(Metodo_de_Pagamento metodo_de_Pagamento){
        novo_metodo_de_Pagamento = metodo_de_Pagamento;
    }

    //Getter and Setter de Metodo_de_Pagamento
    public Metodo_de_Pagamento getNovo_metodo_de_Pagamento() {
        return novo_metodo_de_Pagamento;
    }

    public void setNovo_metodo_de_Pagamento(Metodo_de_Pagamento novo_metodo_de_Pagamento) {
        this.novo_metodo_de_Pagamento = novo_metodo_de_Pagamento;
    }

    //Paga usando o metodo de pagamento adicionado.
    public void pagar(){
        novo_metodo_de_Pagamento.pagar();
    }
}
