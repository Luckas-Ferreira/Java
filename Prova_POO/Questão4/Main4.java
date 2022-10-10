package Questão4;

public class Main4 {
    public static void main(String[] args) {
        Cartão_de_Credito cartão_de_Credito = new Cartão_de_Credito();
        Pagamento pagamento = new Pagamento(cartão_de_Credito);
        pagamento.pagar();

        Boleto boleto = new Boleto();
        Pagamento pagamento2 = new Pagamento(boleto);
        pagamento2.pagar();
    }
}
