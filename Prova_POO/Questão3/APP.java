package Questão3;

public class APP{
    //Atributos usados
    private String usuario;
    private String senha;

    //Construtor salva as informações de login.
    public APP(String uauario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    //Getters and Setters dos atributos
    public String getLogin() {
        return senha;
    }

    public void setLogin(String senha) {
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
