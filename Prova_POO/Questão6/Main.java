public class Main {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente("Luckas", 3333, 4442);
        ContaEspecial e = new ContaEspecial("Garry", 234, 0423213, 700);
        c.depositar(500f);
        c.sacar(600f);
        e.depositar(500f);
        e.sacar(600f);
        
        System.out.println("Conta Corrente\n" + c.toString() + "\n");
        System.out.println("Conta Especial\n" + e.toString());
        
    }
}
