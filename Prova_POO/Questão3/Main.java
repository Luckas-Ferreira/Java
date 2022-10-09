package Questão3;

public class Main {
    public static void main(String[] args) {
        APP celular = new APP("Luana", "Gato");
        APP celular2 = new APP("Luckas", "Lorem");
        Google login1 = new Google(celular);
        Facebook login2 = new Facebook(celular2);

        System.out.println(celular.getUsuario());
        login1.logar();

        System.out.println(celular2.getUsuario());
        login2.logar();
    }
}
