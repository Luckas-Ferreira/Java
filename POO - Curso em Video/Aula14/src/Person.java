package Aula14.src;

public abstract class Person {
    protected String name;
    protected int    age;
    protected String sex;
    protected String experience;

    public Person(String nome, int idade, String sexo){
        this.name = nome;
        this.age  = idade;
        this.sex  = sexo;
        this.experience = 0;
    }
    protected abstract void gainExp();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", experience=" + experience + "]";
    }
}
