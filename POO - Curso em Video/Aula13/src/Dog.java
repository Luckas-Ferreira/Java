package Aula13.src;

public class Dog extends Wolf{
    @Override
    public void makeNoise() {
        System.out.println("Au! Au! Au!");
    }

    public void toReact(String phrase){
        if (phrase.equals("tomar comida") || phrase.equals("Olá")){
            System.out.println("Abanar e Latir");
        }else {
            System.out.println("Rosnar");
        }
    }
    public void toReact(int hora, int minutes){
        if (hora < 12){
            System.out.println("Abanar");
        }else if (hora >= 18){
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e Latir");
        }
    }
    public void toReact(boolean person){
        if (person){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    }
    public void toReact(int age, float weight){
        if (this.age < 5){
            if (this.weight < 10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }else{
            if (this.weight < 10){
                System.out.println("rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
}
