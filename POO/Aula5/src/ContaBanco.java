package Aula5.src;

public class ContaBanco {
    public    int     numConta;
    protected String  tipo;
    private   String  dono;
    private   float   saldo;
    private   boolean status;

    public void verInformações () {
        System.out.println("número da Conta: " + this.numConta);
        System.out.println("Tipo   da conda: " + this.tipo);
        System.out.println("Dono   da conta: " + this.dono);
        System.out.println("Saldo  da conta: " + this.saldo);
        System.out.println("Status da conta: " + this.status);
    }
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
        setStatus(false);
        setSaldo(0f);
    }

    public void abrirConta  (String tipo) {
        setTipo(tipo);
        if (tipo == "CC") {
            setStatus(true);
            setSaldo(50f);
        }
        else if (tipo == "CP") {
            setStatus(true);
            setSaldo(150f);
        }
        else {
            System.out.println("Tipo de conta INVALIDO!");
        }
    }

    public void fecharConta () { 
        if (this.saldo == 0) {
            System.out.println("Conta Fechada");
            setStatus(false);
        }
        else {
            System.out.println("IMPOSSIVEL FECHAR A CONTA!");
            if (this.saldo < 0) {
                System.out.printf("Tem R$%.2f de saldo negativo \n", this.saldo);
            }
            if (this.saldo > 0) {
                System.out.printf("Tem R$%.2f de saldo positivo \n", this.saldo);
            }
        }
    }

    public void depositar   (float saldo) {
        if (this.status == true) {
            setSaldo(getSaldo() + saldo);
        }
        else {
            System.out.println("Você não tem conta aberta");
        }
    }
    public void sacar       (float sacar) {
        if (this.status == true && this.saldo > 0) {
            float valorAtual = this.saldo - sacar;
            if (valorAtual >= 0) {
                this.saldo = valorAtual;
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
