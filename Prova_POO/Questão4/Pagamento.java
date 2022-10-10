package Questão4;

public class Pagamento {
    Metodo_de_Pagamento novo_metodo_de_Pagamento;

    public Pagamento(Metodo_de_Pagamento metodo_de_Pagamento){
        novo_metodo_de_Pagamento = metodo_de_Pagamento;
    }

    public Metodo_de_Pagamento getNovo_metodo_de_Pagamento() {
        return novo_metodo_de_Pagamento;
    }

    public void setNovo_metodo_de_Pagamento(Metodo_de_Pagamento novo_metodo_de_Pagamento) {
        this.novo_metodo_de_Pagamento = novo_metodo_de_Pagamento;
    }

    public void pagar(){
        novo_metodo_de_Pagamento.pagar();
    }
}
