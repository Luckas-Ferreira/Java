public class Main12 {
    public static void main(String[] args) {
        Mammal  m = new Mammal();
        Kangaroo k = new Kangaroo();
        Dog      d = new Dog();


        m.setWeight(85.3f);
        m.setAge(2);
        m.setMembers(4);
        m.move();
        m.feed();
        m.makeNoise();
        System.out.println("");
        k.setWeight(85.3f);
        k.setAge(2);
        k.setMembers(4);
        k.move();
        k.feed();
        k.makeNoise();
        System.out.println("");
        d.setWeight(85.3f);
        d.setAge(2);
        d.setMembers(4);
        d.move();
        d.feed();
        d.makeNoise();
    }
}
