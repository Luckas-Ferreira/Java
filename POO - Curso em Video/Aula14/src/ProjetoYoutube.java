public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("aula 12 de php");
        v[2] = new Video("Aula 10 de html5");
        //System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lucas", 22, "M", "Luckas");
        g[1] = new Gafanhoto("Garry", 2, "M", "Garyzinho");
        System.out.println(g[1].toString());
    }
}
