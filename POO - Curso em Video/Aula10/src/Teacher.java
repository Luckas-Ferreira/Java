public class Teacher extends Person{
    private String specialty;
    private float  salary;

    public void receiveRaise(float receive){
        this.setSalary(this.getSalary() + receive);
    }
    public String getSpecialty(){
        return this.specialty;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
    public float getSalary(){
        return this.salary;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
}
