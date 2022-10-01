public class Fish extends Animal{
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
