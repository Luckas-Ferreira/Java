package Aula2;
public class ExercicioAula2 {
    public static void main(String[] args) {
        Celular motoG = new Celular();
        motoG.marca = "Motorola";
        motoG.modelo = "Moto G10";
        motoG.sistema = "android";
        motoG.versão = 11f;
        motoG.bateria = 50;
        motoG.ligar();
        motoG.status();
        motoG.jogar();
    }
}
