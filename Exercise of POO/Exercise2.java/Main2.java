import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter rectangle width and height");
        Rectangle2 R1 = new Rectangle2();
        System.out.print("Width: ");
        R1.setWidth(keyboard.nextDouble());
        System.out.print("Height: ");
        R1.setHeight(keyboard.nextDouble());
        
        System.out.printf("\nAREA: %.2f", R1.area());
        System.out.printf("\nPERIMETER: %.2f", R1.perimeter());
        System.out.printf("\nDIAGONAL: %.2f \n", R1.diagonal());
        keyboard.close();
    }
}
