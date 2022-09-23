package exerc4;

public abstract class Shape {
  
  // terá cor/formato/area
  public Color color;
  
  // construtor receber uma cor e seta ela
  
  public Shape(Color color) {
     this.color = color;
  }

  public double area(){
    return -1;
  }
}
