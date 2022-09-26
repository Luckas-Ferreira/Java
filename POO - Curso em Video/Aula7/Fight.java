package Aula7;
import java.util.Random;

public class Fight {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void brandFight(Lutador lutador1, Lutador lutador2){
        if (lutador1.getCategory().equals(lutador2.getCategory()) && lutador1 != lutador2){
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void fight(){
        if (this.aprovada){
            this.desafiado.presentation();
            this.desafiante.presentation();
            Random aleatory = new Random();
            int winner = aleatory.nextInt(3);
            switch(winner){
                case 0:
                    System.out.println("EMPATOU!");
                    desafiado.drawFight();
                    desafiante.drawFight();
                case 1:
                System.out.println("GANHADOR: " + desafiado.getName());
                    desafiado.winFight();
                    desafiante.lossFight();
                    break;
                case 2:
                    System.out.println("GANHADOR: " + desafiante.getName());
                    desafiado.lossFight();
                    desafiante.winFight();
                    break;
            }
        }else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Metodos Especiais.
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return this.round;
    }
    public void setRound(int round){
        this.round = round;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
}
