package Questão3;

public class Facebook implements Login {
    //Chama o método da classe APP.
    public Facebook(APP celular){}

    //Sobrescreve o método da interface Login.
    @Override
    public void logar() {
        System.out.println("Logando com o Facebook");
    }
}
