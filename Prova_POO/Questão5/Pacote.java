package Questão5;

public class Pacote extends UFALBluetooth{
    //Classe filha de UFALBluetooth
    
    //Sobrescreve o método nao desenvolvido na classe mãe.
    @Override
    protected void processarDados() {
        System.out.println("Processando dados via PACOTE");
    }
    
}
