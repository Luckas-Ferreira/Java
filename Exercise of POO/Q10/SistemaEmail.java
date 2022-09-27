package Q10;

public class SistemaEmail {
    private SistemaFunc sistema;

    public SistemaEmail(SistemaFunc sistemaFunc) {
        this.sistema = sistemaFunc;
    }

    void sendEmail(Email email) {
        if (!sistema.funcionarios.contains(email.Origem()) || !sistema.funcionarios.contains(email.Destino())) {
            System.out.println("Origem ou destino não registrado no sistema");
            System.exit(1);
        }
        int origemIndex = sistema.funcionarios.indexOf(email.Origem());
        int destinatarioIndex = sistema.funcionarios.indexOf(email.Destino());

        sistema.funcionarios.get(origemIndex).adicionarNovoEmailEnviado(email);
        sistema.funcionarios.get(destinatarioIndex).adicionarNovoEmailRecebido(email);
    }
}
