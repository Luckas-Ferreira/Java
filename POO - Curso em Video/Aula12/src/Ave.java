public class Ave extends Animal {
    private String featherColor;

    @Override
    public void move() {
        System.out.println("Voando");
        
    }

    @Override
    public void feed() {
        System.out.println("Comendo frutas");
        
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de aves");
        
    }
    
    public void nest() {
        System.out.println("Construiu um ninho");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    
}
