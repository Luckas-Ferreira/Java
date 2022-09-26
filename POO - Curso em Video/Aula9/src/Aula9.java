public class Aula9 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "M", 22);
        p[1] = new Pessoa("Maria", "F", 25);
        
        
        l[0] = new Livro("Learning Java", "José de silva", 300, 0, p[1]);
        /*
        l[1] = new Livro("POO para iniciantes", "José Pedro", 350, p[1]);
        l[2] = new Livro("Java Advanced", "Maria goren", 800, p[0]);
        */
        l[0].setCurrentPage(50);
        l[0].backPages();
        System.out.println(l[0].details());
    }
}
