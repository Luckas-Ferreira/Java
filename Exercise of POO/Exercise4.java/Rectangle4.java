public class Rectangle4 extends Shape{
    private double width;
    private double height;
    
    /**
     * @param color
     * @param width
     * @param height
     */
    public Rectangle4(Color color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
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
