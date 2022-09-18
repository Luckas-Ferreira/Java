package POO.Aula7;

public class Lutador implements Ações{
    private String name;
    private String nationality;
    private int    age;
    private float  height;
    private float  weight;
    private String category;
    private int    victory;
    private int    defeat;
    private int    draws;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNationality(){
        return this.nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public float getHeight(){
        return this.height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getWeight(){
        return this.weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public int getVictory(){
        return this.victory;
    }
    public void setVictory(int victory){
        this.victory = victory;
    }
    public int getDefeat(){
        return this.defeat;
    }
    public void setDefeat(int defeat){
        this.defeat = defeat;
    }
    public int getDraws(){
        return this.draws;
    }
    public void setDraws(int draws){
        this.draws = draws;
    }

    @Override
    public void presentation() {
        System.out.println("teste");
    }
    @Override
    public void status() {

    }
    @Override
    public void winFight() {
 
    }
    @Override
    public void lossFight() {

    }
    @Override
    public void drawFight() {

    }

}
