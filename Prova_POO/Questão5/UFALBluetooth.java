package Prova_POO.Questão5;

public abstract class UFALBluetooth {
    public UFALBluetooth(){
        estabelecerConexão();
        processarDados();
        fecharConexão();
    }

    public void estabelecerConexão() {
        System.out.println("Conexão estabelecida com UFAL Bluetooth");
    }
    
    public abstract void processarDados();

    public void fecharConexão() {
        System.out.println("Conexão encerrada!");
    }
}
