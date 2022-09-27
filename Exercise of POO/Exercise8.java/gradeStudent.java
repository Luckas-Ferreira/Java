public class gradeStudent {
    public double values;
    public String subjectName;


    public gradeStudent(double values, String subjectName) {
        this.values = values;
        this.subjectName = subjectName;

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
        return values >= 0 && values <= 10;
    }
    public boolean IsNomeDoAssuntoValid(){
        return subjectName.length() != 0;
    }

    @Override
    public String toString() {
        return String.format("%s: %f ",subjectName, values);
    }
}
