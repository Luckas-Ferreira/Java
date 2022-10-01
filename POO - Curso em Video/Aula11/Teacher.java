package Aula11;

public class Teacher extends Person{
    private String speciality;
    private float  salary;
    private float receiveRaise;
    public void  receiveRaise(float receive){
        this.receiveRaise = receive;
    }
    
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public float getReceiveRaise() {
        return receiveRaise;
    }
    public void setReceiveRaise(float receiveRaise) {
        this.receiveRaise = receiveRaise;
    }
}
