package Questão3;

public class APP{
    private String usuario;
    private String login;

    public APP(String uauario, String login){
        this.usuario = uauario;
        this.login = login;

    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
