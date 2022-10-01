public class Mammal extends Animal{
    private String skinColor;

    @Override
    public void move() {
        System.out.println("Correndo");
        
    }

    @Override
    public void feed() {
        System.out.println("Mamando");
        
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de Mamífero");
        
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    
}
