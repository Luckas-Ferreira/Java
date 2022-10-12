package Questão3;

public class Formulario implements Login{
    //Chama o método da classe APP.
    public Formulario(APP celular){}

    //Sobrescreve o método da interface Login.
    @Override
    public void logar() {
        System.out.println("Logando pelo formulario");
        
    }
}
