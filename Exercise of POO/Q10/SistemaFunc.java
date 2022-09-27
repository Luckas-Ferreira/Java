package Q10;

import java.util.ArrayList;

public class SistemaFunc {
    ArrayList<Funcionario> funcionarios;

    public SistemaFunc() {
        this.funcionarios = new ArrayList<>();
    }

    void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}