import java.util.ArrayList;
import java.util.Scanner;
public class MainTeste {
        public static void main(String[] args) {
            ArrayList<Shape> shapes = new   ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            System.out.print("Rectangle or Circle (r/c)?");
            String option = teclado.next();

            if (option.equals("r")){
                System.out.println("width and height ");
                //double width = sc.nextDouble();
                //double height = sc.nextDouble();
                Rectangle a = new Rectangle(4,3);
            
                shapes.add(a);
            teclado.close();
            System.out.println(a.area());
        }
    }
}

