public class ContaCorrente extends Cliente{
    protected float saldo;

    public void Contal(){

    }

    public void Conta (int agencia, int contaComDigito){
        this.setAgencia(agencia);
        this.setContaComDigito(contaComDigito);
    }
    public void depositar(float valor){
        this.setSaldo(valor);;
    }

    public boolean sacar(float valor){
        float verificação = this.saldo - valor;
        if(verificação > 0){
            this.setSaldo(verificação);
            return true;
        }
        return false;
    }

    
    public ContaCorrente(String nome, int agencia, int contaComDigito) {
        super(nome, agencia, contaComDigito);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Conta Corrente\nNome do Cliente: " + this.getNome() + "\nSaldo: " + saldo;
    }
    
}
