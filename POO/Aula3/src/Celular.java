package Aula3.src;
public class Celular {
    private String  modelo;
    private String  marca;
    private String  sistema;
    private float   versão;
    public  int     bateria;
    private boolean ligado;

    void status () {
        System.out.println("Marca:   " + this.marca);
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Sistema: " + this.sistema);
        System.out.println("Versão:  " + this.versão);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Ligado:  " + this.ligado);
    }

    public void setting() {
        this.marca = "Motorola";
        this.modelo = "Moto G10";
        this.sistema = "Android";
        this.versão = 11f;
    }
    
    public void ligar () {
        this.ligado = true;
    }
    public void desligar () {
        this.ligado = false;
    }
    void baixarApp () {
        if (this.ligado == false) {
        System.out.println("ERRO!, o celular está desligado.");
        } else {
            if (this.sistema == "android" && this.versão >= 10) {
                System.out.println("Baixando");
            } else {
                System.out.println("ERRO, seu celular não é compativel com esse app");
            }
        }
    }
    public void jogar () {
        if (this.ligado == false) {
            System.out.println("ERRO, o celular está desligado.");
        } else {
            if (bateria > 40) {
                System.out.println("BOM JOGO, divirta-se");
            } else {
                System.out.println("A bateria está baixa");
            }
        }
    }

}
