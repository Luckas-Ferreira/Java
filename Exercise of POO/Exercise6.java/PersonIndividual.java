public class PersonIndividual extends Person{
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
      }

    public String getCpf() {
        return cpf;
    }

   

    public String toString() {
    
      
      System.out.println("Validando CPF");
      
        return String.format("{Individual} CPF: %s", this.cpf);
      }
    
      

        
       
    
}
