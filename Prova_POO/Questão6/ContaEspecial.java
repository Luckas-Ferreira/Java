public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(String nome, int agencia, int contaComDigito, int limite) {
        super(nome, agencia, contaComDigito);
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor) {
        if (valor <= this.getLimite()){
            this.setSaldo(this.saldo - valor);
            return super.sacar(this.getSaldo());
        }
        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
}

    