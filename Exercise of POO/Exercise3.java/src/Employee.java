public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getGrossSalary(){
        return this.grossSalary;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public double getTax(){
        return this.tax;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    public double netSalary(){
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentagem) {
        this.setGrossSalary(this.netSalary() + (this.getGrossSalary() * 0.10f));
        
    }
    public void status(){
        System.out.printf("Update data: %S, %.2f", getName(), getGrossSalary());
    }
}
