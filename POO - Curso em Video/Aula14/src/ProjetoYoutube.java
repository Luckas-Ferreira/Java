import Aula14.src.Video;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("aula 12 de php");
        v[2] = new Video("Aula 10 de html5");
        System.out.println(v[0].toString());
    }
}
