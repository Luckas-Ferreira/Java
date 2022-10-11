public class Cliente {
    protected String nome;
    protected int agencia;
    protected int contaComDigito;
    

    @Override
    public String toString() {
        return "Nome do Cliente: " + nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaComDigito() {
        return contaComDigito;
    }

    public void setContaComDigito(int contaComDigito) {
        this.contaComDigito = contaComDigito;
    }
    
}
