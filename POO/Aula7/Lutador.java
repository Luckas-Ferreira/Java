package Aula7;

public class Lutador {
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int victory;
    private int defeat;
    private int draws;

    public Lutador(String no, String na, int ag, float he, float we, int vi, int de, int dr){
        this.name = no;
        this.nationality = na;
        this.age = ag;
        this.height = he;
        this.setWeight(we);
        this.victory = vi;
        this.defeat = de;
        this.draws = dr;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return this.category;
    }

    private void setCategory() {
        if (this.getWeight() < 52.2) {
            this.category = "inválido";
        }else if (this.getWeight() <= 70.3){
            this.category = "Leve";
        }else if (this.getWeight() <= 83.9){
            this.category = "Médio";
        }else if (this.getWeight() <= 120.2){
            this.category = "Pesado";
        }else {
            this.category = "Inválido";
        }
    }

    public int getVictory() {
        return this.victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public int getDefeat() {
        return this.defeat;
    }

    public void setDefeat(int defeat) {
        this.defeat = defeat;
    }

    public int getDraws() {
        return this.draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
    
    public void presentation() {
        System.out.println("On this side we have " + getName());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight());
        System.out.println("Weight: " + getWeight());
        System.out.println("Victorys: " + getVictory());
        System.out.println("defeats: " + getDefeat());
        System.out.println("draws: " + getDraws());
    }

    public void status() {
        System.out.println(this.getName() + "your weight is " + this.getCategory());
        System.out.println("Wins: " + getVictory());
        System.out.println("Loss: " + getDefeat());
        System.out.println("Draws: " + getDraws());
    }

    public void winFight() {
        setVictory(getVictory() + 1);
    }

    public void lossFight() {
        setDefeat(getDefeat() + 1);
    }

    public void drawFight() {
        setDraws(getDraws() + 1);
    }

}
