import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Employee p1 = new Employee();

        System.out.print("Name: ");
        p1.setName(keyboard.next());
        System.out.print("Gross Salary: ");
        p1.setGrossSalary(keyboard.nextDouble());
        System.out.print("Tax: ");
        p1.setTax(keyboard.nextDouble());
        

        System.out.printf("Employee: %S, %.2f \n", p1.getName(), p1.netSalary());
        System.out.print("Which percentegem to increase salary?");
        p1.increaseSalary(keyboard.nextDouble());
        p1.status();
        System.out.println("");
        keyboard.close();
    }
}
