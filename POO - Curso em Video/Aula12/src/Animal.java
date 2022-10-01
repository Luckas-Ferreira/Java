public abstract class Animal {
    protected float weight;
    protected int   age;
    protected int members;

    public abstract void move();
    public abstract void feed();
    public abstract void makeNoise();

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
}
