public abstract class Bebida{
    public Bebida(){
        feverAgua();
        preparar();
        servir();
    }
    public void servir(){
        System.out.println("Servindo a bebida");
    }

    protect abstract void preparar();

    public void feverAgua(){
        System.out.printle(x: "Fervendo água..");
    }
}