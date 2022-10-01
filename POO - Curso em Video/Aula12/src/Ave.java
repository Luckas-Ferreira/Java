public class Ave extends Animal {
    private String featherColor;

    public float getWeight(){
        return this.weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getMembers(){
        return this.members;
    }
    public void setMembers(int members){
        this.members = members;
    }
    
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
