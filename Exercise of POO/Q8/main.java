package Q8;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota(10, "Química"));
        notas.add(new Nota(8, "História"));
        notas.add(new Nota(7, "Geografia"));
        notas.add(new Nota(6, "Inglês"));
        notas.add(new Nota(8, "Português"));

        Aluno aluno = new Aluno("Maria José", "20182542", notas);
        System.out.println(aluno);
    }
}
