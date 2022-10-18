package Questão5;

public abstract class UFALBluetooth {
    //Contrutor inicia os tres métodos quando chama o objeto
    public UFALBluetooth(){
        estabelecerConexão();
        processarDados();
        fecharConexão();
    }

    //Método usado nos dois tipos de conexão.
    public void estabelecerConexão() {
        System.out.println("Conexão estabelecida com UFAL Bluetooth");
    }
    
    //Método abstrado para ser desenvolvido dentro das classes de conexão
    protected abstract void processarDados();

    //Método usado nos dois tipos de conexão.
    public void fecharConexão() {
        System.out.println("Conexão encerrada!");
    }
}
