import java.util.Scanner;
public class EstruturaRepeticao {
    public static void main(String[] args) {
        /*
        byte cc = 1;
        while (cc < 5) {
            System.out.printf("Cambalhota - %d \n", cc);
            cc++;
        }
        */
        Scanner teclado = new Scanner(System.in);
        byte n, s = 0;
        String resp;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextByte();
            s += n;
            System.out.println("Quer continuar? [S/N]: ");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.printf("A soma de todos oos valores foi: %d", s);
        teclado.close();
    }
}
