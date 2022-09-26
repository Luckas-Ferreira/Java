public class Rectangle2 {
    private double width;
    private double height;

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double area(){
        return this.getWidth() * this.getHeight();
    }
    public double perimeter(){
        return (this.getHeight() * 2);
    }
    public double diagonal(){
        return Math.sqrt((Math.pow(this.getWidth(), 2)) + (Math.pow(this.getHeight(), 2)));
    }
}
