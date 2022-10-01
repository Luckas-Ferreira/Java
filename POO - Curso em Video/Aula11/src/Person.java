package Aula11.src;

public class Person {
    private String name;
    private String sex;
    private int    age;
    public Object receiveRaise;
    
    public int birthday(){
        return this.age++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
