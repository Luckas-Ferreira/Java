public class PersonLegal extends Person {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PersonLegal(String cnpj){
        this.cnpj=cnpj;
    }
    public String toString() {
        System.out.println("Validating CNPJ");
        return String.format("{Legal}, CNPJ: %s", this.cnpj);
      }
    
     
      
    }

    

