public class Circle extends Shape{
    private double radius;

    /**
     * @param color
     * @param radius
     */
    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
