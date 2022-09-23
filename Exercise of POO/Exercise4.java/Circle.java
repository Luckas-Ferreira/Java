package exerc4;

public class Circle extends Shape {
  private double radius;

  public Circle(Color color, double radius) {
    super(color);
    this.radius = radius;    //TODO Auto-generated constructor stub
  }

  @Override 
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }

}
