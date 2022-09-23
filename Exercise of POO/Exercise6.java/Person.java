package exerc6;

//implements serve como um contrato (interface)

public class Person implements IEntityValidator{

  @Override
  public String toString() {
    return "Type: Person";
  }

  @Override
  public boolean isValid(){
    return false;
  }
}
