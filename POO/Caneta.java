public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Cor:     " + this.cor);
        System.out.println("Ponta:   " + this.ponta);
        System.out.println("Carga:   " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO!");
        } else {
            System.out.println("Rabisco");
        }
    }
}
