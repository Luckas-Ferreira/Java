package Questão4;

public class Cartão_de_Credito implements Metodo_de_Pagamento{
    //Classe filha de Metodo_de_Pagamento.
    
    
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado pelo Cartão de Credito");
    }
}
