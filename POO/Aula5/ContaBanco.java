package POO.Aula5;

public class ContaBanco {
    public    int     numConta;
    protected String  tipo;
    private   String  dono;
    private   float   saldo;
    private   boolean status;

    public int getNumConta() {
        return numConta;
    }
    public String  getTipo() {
        return tipo;
    }
    public String  getDono() {
        return dono;
    }
    public float  getSaldo() {
        return saldo;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setTipo     (String tipo) {
        this.tipo     = tipo;
    }
    public void setDono     (String dono) {
        this.dono     = dono;
    }
    public void setSaldo    (float saldo) {
        this.saldo    = saldo;
    }
    public void setStatus(boolean status) {
        this.status   = status;
    }

    public ContaBanco       () {
        this.status = false;
        this.saldo  = 0f;
    }

    public void abrirConta  (String tipo) {
        this.tipo = tipo;
        if (this.tipo == "CC") {
            this.status = true;
            this.saldo  = 50;
        }
        else if (this.tipo == "CP") {
            this.status = true;
            this.saldo  = 150;
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
    public void sacar       (float sacar) {
        if (this.status == true && this.saldo > 0) {
            float valorAtual = this.saldo - sacar;
            if (valorAtual > 0) {
                System.out.println("Saque realizado com sucesso!");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void pagarMensal () {
        if (this.tipo == "CC") {
            this.saldo -= 12f;
        }
        else if (this.tipo == "CP") {
            this.saldo -= 20f;
        }
    }
}