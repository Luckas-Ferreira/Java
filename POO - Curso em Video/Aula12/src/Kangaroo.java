public class Kangaroo extends Mammal{
    public void useBag(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void move() {
        System.out.println("Saltando");
    }
    
}
