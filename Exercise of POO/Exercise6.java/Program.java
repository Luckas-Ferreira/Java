package exerc6;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o CPF e o CNPJ: ");
    PersonIndividual personIndividual = new PersonIndividual(sc.nextLine());
    PersonLegal personLegal = new PersonLegal(sc.nextLine());
    System.out.println(personIndividual.isValid());
    System.out.println(personLegal.isValid());
    sc.close();
  }
}
