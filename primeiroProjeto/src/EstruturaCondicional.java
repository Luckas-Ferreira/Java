import java.util.Scanner;
public class EstruturaCondicional {
    public static void main(String[] args) {
        //Exemplo 1
        /*
        float n1, n2, m;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = teclado.nextFloat();
        teclado.close();
        m = (n1 + n2) / 2;
        if (m >= 9) {
            System.out.println("Parabéns!");
        }
        System.out.printf("Sua nota final foi: %.2f", m);
        */

        //Exemplo 2
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int idade, nasc;
        String atual;
        nasc = teclado.nextInt();
        idade = 2022 - nasc;
        if (idade >= 18) {
            atual = "De maior";
        } else {
            atual = "De menor";
        }
        System.out.printf("Esse(a) joven é %s", atual);
        teclado.close();
    }
}
