package POO.Aula5;

public class ContaBanco {
    private int     numConta;
    private String  tipo;
    private String  dono;
    private float   saldo;
    private boolean status;

    public ContaBanco       () {
        
    }

    public void abrirConta  () {
        this.status = true;
        if (this.tipo == "CC") {
            this.saldo = 50;
        }
        else if (this.tipo == "CP") {
            this.saldo = 150;
        }
        else {
            System.out.println("Tipo de conta INVALIDO!");
        }
    }

    public void fecharConta () { 
        if (this.saldo == 0) {
            System.out.println("Conta Fechada");
        }
        else {
            System.out.println("IMPOSSIVEL FECHAR A CONTA!");
            if (this.saldo < 0) {
                System.out.printf("Tem R$%d.2f de saldo negativo");
            }
            if (this.saldo > 0) {
                System.out.printf("Tem R$%d.2f de saldo positivo");
            }
        }
    }

    public void depositar   (float saldo) {
        if (this.status == true) {
            this.saldo = saldo;
        }
        else {
            System.out.println("Você não tem conta aberta");
        }
    }
    public void sacar       (float saldo) {
        if (this.status == true) {
            
        }
    }
    public void pagarMensal () {

    }
}
