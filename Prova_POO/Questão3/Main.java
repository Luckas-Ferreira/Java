package Questão3;

public class Main {
    public static void main(String[] args) {
        APP celular = new APP("Luana", "Gato");
        Google login1 = new Google(celular);
        System.out.println(celular.getUsuario());
        login1.logar();
    }
}
