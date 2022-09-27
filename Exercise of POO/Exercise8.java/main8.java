import java.util.ArrayList;

public class main8 {
    public static void main(String[] args) {
        ArrayList<gradeStudent> employee = new ArrayList<>();

        employee.add(new gradeStudent(8f, "Biology"));
        employee.add(new gradeStudent(7f, "History"));
        employee.add(new gradeStudent(9f, "Geography"));
        employee.add(new gradeStudent(10f, "English"));
        employee.add(new gradeStudent(9.5f, "Portuguese"));

        Student student = new Student("José Luckas", "20182542", employee);
        System.out.println(student);
    }
}