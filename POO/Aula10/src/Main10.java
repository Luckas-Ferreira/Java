public class Main10 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Functionary p4 = new Functionary();

        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Claudio");
        p4.setName("Fabiana");

        System.out.println(p1.getName());

    }
}
