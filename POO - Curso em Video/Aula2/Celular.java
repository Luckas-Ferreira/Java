package Aula2;
public class Celular {
    String  modelo;
    String  marca;
    String  sistema;
    float   versão;
    int     bateria;
    boolean ligado;

    void status () {
        System.out.println("Marca:   " + this.marca);
        System.out.println("Modelo:  " + this.modelo);
        System.out.println("Sistema: " + this.sistema);
        System.out.println("Versão:  " + this.versão);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Ligado:  " + this.ligado);
    }
    void ligar () {
        this.ligado = true;
    }
    void desligar () {
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
    void jogar () {
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
