public class Cliente {
    private String nome;
    private int agencia;
    private int contaComDigito;
    public Cliente(String nome, int agencia, int contaComDigito){
        this.nome = nome;
        this.agencia = agencia;
        this.contaComDigito = contaComDigito;
    }

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
