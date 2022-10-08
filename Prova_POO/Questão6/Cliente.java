public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Nome do Cliente: " + nome;
    }
    
}
