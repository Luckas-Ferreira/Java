public class Main12 {
    public static void main(String[] args) {
        Mammal  m = new Mammal();
        Reptile r = new Reptile();
        Fish    f = new Fish();
        Ave     a = new Ave();

        m.setWeight(85.3f);
        m.setAge(2);
        m.setMembers(4);
        m.move();
        m.feed();
        m.makeNoise();
        System.out.println("");
        r.setWeight(0.35f);
        r.setAge(1);
        r.setMembers(0);
        r.move();
        r.feed();
        r.makeNoise();  
        System.out.println("");
        f.setWeight(0.89f);
        f.setAge(2);
        f.setMembers(2);
        f.move();
        f.feed();
        f.makeNoise(); 
    }
}
