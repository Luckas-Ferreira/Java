package Aula11.src;

public class Student {
    private int    enrollment;
    private String curse;

    public void payMonthlyFee(){
        System.out.println("Monthly fee");
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }
}
