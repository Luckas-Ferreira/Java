import java.util.ArrayList;
import java.util.Scanner;
public class Main4 {
        
        public static void main(String[] args) {
            ArrayList<Shape> shapes = new   ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            System.out.print("Rectangle or Circle (r/c)?");
            String option = teclado.next();

            Color color = Color.valueOf("RED");
            if (option.equals("r")){
                System.out.println("width and height ");
                
                Rectangle4 r = new Rectangle4(color, 4,5);
                System.out.println(r.area());

            if (option.equals("c")){
                Circle c = new Circle(color, 3);
                System.out.println(c.area());
            }
            shapes.add(r);
            teclado.close();  
        }
    }
}

