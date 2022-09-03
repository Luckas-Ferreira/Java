public class Aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.tampada = true;
        c1.ponta = 0.5f;
        c1.status();
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 1f;
        c2.status();
    }
}
