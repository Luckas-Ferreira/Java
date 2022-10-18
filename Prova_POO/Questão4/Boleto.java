package Questão4;

public class Boleto implements Metodo_de_Pagamento{
    //Classe filha de Metodo_de_Pagamento.
    
    //Sobrescreve o método não desenvolvido na classe mãe.
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado pelo Boleto");
    }
}
