package Aula5.src;

public class Pessoa {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setDono("Luckas");
        p1.setNumConta(8551156);
        p1.verInformações();
        p1.sacar(50f);
        p1.fecharConta();
        p1.abrirConta("CP");
        p1.sacar(150f);
        p1.pagarMensal();
        p1.fecharConta();
        p1.verInformações();
    }
}