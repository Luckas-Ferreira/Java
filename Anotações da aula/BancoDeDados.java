public class BancoDeDados {
    static private BancoDeDados instance;
    private boolean connected;

    private BancoDeDados() {
        connected = true;
    }    
    public static BancoDeDados getInstance(){
        if (instace == null){
            instance = new BancoDeDados();
        
        return instace;
    }
}