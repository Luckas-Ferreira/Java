package questão1;

public class Itens {
	private String titulo;
    private int tempo;

    public Itens(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
  
    
    @Override
    public String toString() {
        return "[Produto: " + this.titulo + ", " + this.tempo + " minutos]";
    }
}
