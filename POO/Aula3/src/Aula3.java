package Aula3.src;

public class Aula3 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
