public class Mammal extends Animal{
    private String skinColor;

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
