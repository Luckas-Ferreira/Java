package Aula11.src;

public class ScholarShip extends Student{
    private float assistance;
    
    public  void renewBag(){
        System.out.println("Renovando bolsa de " + this.name);
    }
    @Override
    public void payMonthlyFee() {
        System.out.println(this.name + " É bolsista, pagamento facilitado");
    }
    public float getAssistance() {
        return assistance;
    }
    public void setAssistance(float assistance) {
        this.assistance = assistance;
    }
}
