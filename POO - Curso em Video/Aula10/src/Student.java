public class Student extends Person{
    private int    enrollment;
    private String curse;

    public void cancelEnrollment() {
        System.out.println("Matricula será cancelada");
    }

    public int getEnrollment(){
        return this.enrollment;
    }
    public void setEnrollmente(int enrollment) {
        this.enrollment = enrollment;
    }
    public String getCurse(){
        return this.curse;
    }
    public void setCurse(String curse){
        this.curse = curse;
    }
    
}
