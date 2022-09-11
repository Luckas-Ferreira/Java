public class Main {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.setModelo("Big cristal");
        c1.setPonta(0.5f);
        c1.cargaCaneta(80);
        c1.destampar();
        c1.status();
    }
}
