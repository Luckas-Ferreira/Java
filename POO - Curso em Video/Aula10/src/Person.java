public class Person {
    private String name;
    private String sex;
    private int    age;

    public void birthday(){
        this.setAge(this.age++);
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
}
