public class Functionary extends Person {
    private String sector;
    private boolean working;

    public void changeWork(){
        if (this.working){
            this.setSector(sector);
            System.out.println("Agora está trabalhando: " + this.getSector());
        }else{
            System.out.println("Não está trabalhando");
        }
    }
    public String getSector(){
        return this.sector;
    }
    public void setSector(String sector){
        this.sector = sector;
        this.setWorking(true);
    }
    public boolean getWorking(){
        return this.working;
    }
    public void setWorking(boolean working){
        this.working = working;
    }
}
