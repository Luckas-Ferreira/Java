public class Reptile extends Animal{
    private String scaleColor;

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
    
    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public void move() {
        System.out.println("Rastejando");
        
    }

    @Override
    public void feed() {
        System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void makeNoise() {
        System.out.println("Som de Réptil");
        
    }
    
}
