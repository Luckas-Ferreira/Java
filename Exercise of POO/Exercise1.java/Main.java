import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = keyboard.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = keyboard.nextDouble();
        CurrencyConverter real = new CurrencyConverter();
        double result = real.dollarToReal(amount, price);
        System.out.printf("Amount to be paid in reais = R$%.2f", result);
        keyboard.close();
    }
}
