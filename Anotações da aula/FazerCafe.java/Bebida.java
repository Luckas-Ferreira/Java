public abstract class Bebida {
    Bebida (){
        feverAgua();
        preparar();
        servir();
    }

    public void feverAgua(){
        System.out.println("Fervendo agua");
    }
    protected abstract void preparar();

    public void servir(){
        System.out.println("Servindo a bebida");
    }
}
