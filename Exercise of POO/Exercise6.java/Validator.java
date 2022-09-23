package exerc6;

public class Validator {
  static public void runValidation(IEntityValidator validation) {
    if (validation.isValid()) {
      System.out.println("Valid Entity");
    } else {
      System.out.println("Invalid Entity");
    }
  }
}
