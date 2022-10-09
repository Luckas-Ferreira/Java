package Questão3;

public class APP{
    private String usuario;
    private String senha;

    public APP(String uauario, String senha){
        this.usuario = uauario;
        this.senha = senha;

    }
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
