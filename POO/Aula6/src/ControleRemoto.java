public class ControleRemoto implements Controlador{
    private int     volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void deligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? "  + this.ligado);
        System.out.println("Está tocando? " + this.tocando);
        System.out.print("Volume: "       + this.volume);
        for (int i = 0; i <= this.volume; i += 10) {
            System.out.print("| ");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()){ 
            this.setVolume(this.getVolume() + 1);
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.volume > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.ligado && this.volume == 0) {
            this.setVolume(50);
        } 
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.ligado && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
