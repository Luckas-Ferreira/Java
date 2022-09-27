package Q8;

public class Nota {
    public double valor;
    public String nomeDoAssunto;

    public Nota(double valor, String nomeDoAssunto) {
        this.valor = valor;
        this.nomeDoAssunto = nomeDoAssunto;

        if (!IsNotasValid()) {
            System.out.println("Nota invalida");
            System.exit(1);
        }
        if (!IsNomeDoAssuntoValid()) {
            System.out.println("Nome do assunto invalido");
            System.exit(1);
        }
    }

    public boolean IsNotasValid(){
        return valor >= 0 && valor <= 10;
    }
    public boolean IsNomeDoAssuntoValid(){
        return nomeDoAssunto.length() != 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %f ",nomeDoAssunto, valor);
    }
}
