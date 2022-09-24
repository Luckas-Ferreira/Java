import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Rectangle or Circle (r/c)?");
        String option = teclado.next();

        if (option == "r"){
            Rectangle r = new Rectangle();
            r.setWidth(4f);
            r.setHeight(5f);
            System.out.println(r.area());
        teclado.close();
        }
    }
}
