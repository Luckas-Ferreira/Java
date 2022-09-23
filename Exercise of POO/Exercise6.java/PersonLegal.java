package exerc6;

public class PersonLegal extends Person {

  private String cnpj;

  public PersonLegal(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return String.format("{Legal}, CNPJ: %s", cnpj);
  }

  @Override
  public boolean isValid() {
    return cnpjValidator.isCNPJ(cnpj);
  }
}
