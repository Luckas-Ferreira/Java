public class ContaCorrente{
    protected float saldo;
    
    //Chamando o objeto Cliente.
    Cliente cliente = new Cliente();

    //Construtor para adicionar uma nova conta Corrente.
    public ContaCorrente(String nome, int agencia, int contaComDigito) {
        cliente.agencia = agencia;
        cliente.nome = nome;
        cliente.contaComDigito = contaComDigito;
    }

    //Adicionar o valor no atributo saldo.
    public void depositar(float valor){
        this.setSaldo(valor);;
    }

    //Faz a subtração do valor menos o saldo e salva o novo valor.
    public boolean sacar(float valor){
        float verificação = this.saldo - valor;
        if(verificação > 0){
            this.setSaldo(verificação);
            return true;
        }
        return false;
    }

    //Faz a subtração do valor menos o saldo e salva o valor.
    public void transferir(float transferir){
        float resultado = this.saldo - transferir;
        if(resultado > 0){
            this.setSaldo(resultado);
        }
    }

    //Getter and Setter de saldo.
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Contal(){

    }

    //Mostrar na tela as informaçoes.
    @Override
    public String toString() {
        return "Nome do Cliente: " + cliente.getNome() + "\nSaldo: " + saldo;
    }
    
}
