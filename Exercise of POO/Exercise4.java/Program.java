package exerc4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of shapes: ");
    int numberOfShapes = sc.nextInt();
    ArrayList<Shape> shapes = new ArrayList<>();

    for (int i = 0; i < numberOfShapes; i++) {
      System.out.printf("Shape %d data: \n", i + 1);
      System.out.print("Rectangle or Circle (r/c)? ");
      sc.nextLine();
      String ShapeType = sc.nextLine();
      System.out.print("Color (RED/BLACK/BLUE)? ");
      String colorName = sc.nextLine();
      Color color = Color.valueOf(colorName);

      if (ShapeType.equals("r")) {
        // lidar com retangulo
        System.out.print("Choose widht and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle rect = new Rectangle(color, width, height);
        shapes.add(rect);

      } else if (ShapeType.equals("c")) {
        // lidar com circulo
        System.out.print("Choose Radius: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(color, radius);
        shapes.add(circle);

      } else
        break;

      System.out.println("SHAPE AREAS: ");
      // equivalente a for shape in shapes
      for (Shape shape : shapes) {
        System.out.println(shape.area());
      }
    }
    sc.close();
  }
}
