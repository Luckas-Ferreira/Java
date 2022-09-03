package POO;

public class Caneta {
    String  modelo;
    String  cor;
    float   ponta;
    int     carga;
    boolean tampada;

    void status () {
        System.out.println("Está é uma caneta " + this.cor);
    }
    void rabiscar () {
        if (tampada = true) {
            System.out.println("ERRO!");
        } else {
            System.out.println("Rabisco");
        }
    }
    void tampar () {
        tampada = true;
    }
    void destampar () {
        tampada = false;
    }
}
