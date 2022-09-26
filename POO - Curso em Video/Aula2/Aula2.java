package Aula2;
public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.carga = 90;
        c1.tampada = true;
        c1.ponta = 0.5f;
        c1.status();
        c1.destampar();
        c1.rabiscar();
    }
}
