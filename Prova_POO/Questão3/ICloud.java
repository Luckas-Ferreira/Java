package Questão3;

public class ICloud implements Login{
    //Chama o método da classe APP.
    public ICloud(APP celular){}

    //Sobrescreve o método da interface Login.
    @Override
    public void logar() {
        System.out.println("Logando com o ICloud");
        
    }
    
}
