public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Está caneta é " + this.cor + " e tem uma ponta de " + this.ponta);
    }
    void tampar() {
        tampada = true;
    }
    void destampar() {
        tampada = false;
    }
    void rabiscar() {
        if (tampada == true) {
            System.out.println("ERRO!");
        } else {
            System.out.println("Rabisco");
        }
    }
}
