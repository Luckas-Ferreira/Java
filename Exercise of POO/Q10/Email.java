package Q10;

import java.util.Date;

public class Email {
    private String titulo;
    private String mensagem; 
    private Funcionario origem;
    private Funcionario destino;
    private Date dataDeEnvio;

    public Email(String titulo, String mensagem, Funcionario origem, Funcionario destino, Date dataDeEnvio) {
        if(mensagem.length() > 2500) {
            System.out.println("Tamanho máximo da mensagem é de 2500 caracteres");
            System.exit(1);
        }

        this.titulo = titulo;
        this.mensagem = mensagem;
        this.origem = origem;
        this.destino = destino;
        this.dataDeEnvio = dataDeEnvio;
    }

    public Funcionario Origem() {
        return origem;
    }

    public void setOrigem(Funcionario origem) {
        this.origem = origem;
    }

    public Funcionario Destino() {
        return destino;
    }

    public void setDestino(Funcionario destino) {
        this.destino = destino;
    }

    public String Mensagem() {
        return mensagem;
    }

    public String Titulo(){
        return titulo;
    }
}
    
