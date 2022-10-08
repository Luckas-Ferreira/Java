public class Main {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente("Luckas", 3333, 4442);
        ContaCorrente c2 = new ContaCorrente("Pedro", 34, 4472);
        c.depositar(500f);
        c.sacar(5000f);
        System.out.println(c2.toString());
    }
}
