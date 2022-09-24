public class Rectangle extends Shape{
    private double width;
    private double height;
    @Override
    public double area() {
        return this.getHeight() * this.getWidth();
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
