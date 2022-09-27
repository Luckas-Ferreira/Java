package Q10;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        SistemaFunc sistemaFunc = new SistemaFunc();
        SistemaEmail sistemaEmail = new SistemaEmail(sistemaFunc);
        Funcionario funcionario1 = new Funcionario("Maria", "Advogada", "504218", "maria20141@gmail.com");
        Funcionario funcionario2 = new Funcionario("Julia", "Advogada", "502481", "juliasalles@gmail.com");
        sistemaFunc.addFuncionario(funcionario1);
        sistemaFunc.addFuncionario(funcionario2);

        Email email = new Email("Assunto", "Olá, tudo bem?", funcionario1, funcionario2, new Date());
        sistemaEmail.sendEmail(email);

        for (Funcionario funcionario : sistemaFunc.funcionarios) {
            System.out.println(funcionario.getName());
            System.out.println(funcionario.getEmail());
            System.out.println("Email recebidos: ");
            for (Email emailRecebido : funcionario.getEmailRecebidos()) {
                System.out.println(emailRecebido.Titulo());
            }
            System.out.println();
            System.out.println("Email enviado: ");
            for (Email emailRecebido : funcionario.getEmailEnviados()) {
                System.out.println(emailRecebido.Titulo());
            }
            System.out.println();
        }
    }
}
