package Questão5;

public class Serial extends UFALBluetooth{
    //Classe filha de UFALBluetooth
    
    //Sobrescreve o método nao desenvolvido na classe mãe.
    @Override
    public void processarDados() {
        System.out.println("Processando dados via comunicação: SERIAL");
        
    }
    
}
