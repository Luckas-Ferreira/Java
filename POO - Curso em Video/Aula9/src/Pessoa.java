public class Pessoa {
    private String name;
    private String sex;
    private int    age;

    public Pessoa (String name, String sex, int age){
        this.name = name;
        this.sex  = sex;
        this.age  = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public void birthday(){
        this.age ++;
    }
}
