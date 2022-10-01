package Aula11.src;

public class Teacher extends Person{
    private String speciality;
    private float  salary;
    private float  increase;
    private float receiveRaise;
    
    
    public void receiveRaise(){
        this.setSalary(this.getSalary() + this.getIncrease());;
    }
    public void status(){
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Increase: " + this.getIncrease());
        
    }
    public float getIncrease() {
        return this.increase;
    }
    public void setIncrease(float increase){
        this.increase = increase;
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
        this.salary = salary + this.getIncrease();
    }
    public float getReceiveRaise() {
        return receiveRaise;
    }
    public void setReceiveRaise(float receiveRaise) {
        this.receiveRaise = receiveRaise;
    }
}
