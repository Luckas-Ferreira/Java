import java.util.ArrayList;

public class Student {
    public String fullName;
    public String enrollment;
    public ArrayList<gradeStudent> employ;

    public Student(String fullName, String enrollment, ArrayList<gradeStudent> employ) {
        this.fullName = fullName;
        this.enrollment = enrollment;
        this.employ = employ;

        if (!IsNameValid()) {
            // pare o programa
            System.out.println("Nome invalido");
            System.exit(1);
        }
        if (!IsMatriculaValid()) {
            // pare o programa
            System.out.println("Matrícula invalida");
            System.exit(1);
        }
        if (!IsNotasValid()) {
            // pare o programa
            System.out.println("Notas invalidas");
            System.exit(1);
        }
    }

    public boolean IsNameValid() {
        return fullName.split(" ").length >= 2 && fullName.length() < 50;
    }

    public boolean IsMatriculaValid() {
        return enrollment.length() == 8 && enrollment.startsWith("201");
    }

    public boolean IsNotasValid() {
        return employ.size() == 5;
    }

    public void descarteNotaMenor() {
        int indiceDaMenorNota = 0;
        for (int i = 0; i < employ.size(); i++) {
            if (employ.get(i).values < employ.get(1).values)
                indiceDaMenorNota = i;
        }
        employ.remove(indiceDaMenorNota);
    }

    public double SemesterNote() {
        descarteNotaMenor();
        double soma = 0;
        for (gradeStudent nota : employ) {
            soma += nota.values;
        }
        return (soma / 4);
    }

    public double FinalNote() {
        double semesterNote = SemesterNote();

        if (semesterNote < 6) {
            semesterNote -= (semesterNote * 0.25);
        } else if (semesterNote >= 6 && semesterNote <= 7) {
            semesterNote = 7;
        } else if (semesterNote >= 7 && semesterNote <= 8) {
            semesterNote += (semesterNote * 0.15);
        } else {
            semesterNote = 10;
        }
        // nota semestral agora representa a nota final
        return semesterNote;
    }

    @Override
    public String toString() {
        String formattedNote = "";
        for (gradeStudent employ : employ) {
            formattedNote += employ + "\n";
        }

        return String.format(
                "Matrícula: %s\nFull name: %s\nFormatted Note: %s\nSemester note: %s\nFinal note: %s\n",
                enrollment, fullName,
                formattedNote, SemesterNote(), FinalNote());
    }
}
