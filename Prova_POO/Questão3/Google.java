package Questão3;

public class Google implements Login{
    //Chama o método da classe APP.
    public Google(APP celular){}    

    //Sobrescreve o método da interface Login.
    @Override
    public void logar() {
        System.out.println("Logando com o Google");
    }  
}
