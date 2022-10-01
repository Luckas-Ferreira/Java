public class Fish extends Animal{
    private String scaleColor;

    @Override
    public void move() {
        System.out.println("Nadando");
        
    }

    @Override
    public void feed() {
        System.out.println("Algas");
        
    }

    @Override
    public void makeNoise() {
        System.out.println("Peixe não faz som");
        
    }

    public void dropBubble() {
        System.out.println("Soltou uma bolha");
    }
    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
}
