public class ContaCorrente{
    protected float saldo;
    
    Cliente cliente = new Cliente();
    
    public void Contal(){

    }

    public ContaCorrente(String nome, int agencia, int contaComDigito) {
        cliente.agencia = agencia;
        cliente.nome = nome;
        cliente.contaComDigito = contaComDigito;
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Nome do Cliente: " + cliente.getNome() + "\nSaldo: " + saldo;
    }
    
}
