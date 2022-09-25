import java.util.ArrayList;
import java.util.Scanner;
public class MainPrincipal {
        
        public static void main(String[] args) {
            ArrayList<Shape> shapes = new   ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            System.out.print("Rectangle or Circle (r/c)?");
            String option = teclado.next();

            Color color = Color.valueOf("RED");
            if (option.equals("r")){
                System.out.println("width and height ");
                
                Rectangle a = new Rectangle(color, 4,5);
                System.out.println(a.area());

            
            if (option.equals("c")){
                Circle c = new Circle(color, 3);
                c.area();
            }
            shapes.add(a);
            teclado.close();  
        }
    }
}

