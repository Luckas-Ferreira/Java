package Exercise5;

import java.sql.Date;

class Client{
    private String name;
    private String email;
    private Date   birthDate;

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    public String getEmail() {
        return email;
    }
    
    public String getName() {
        return name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
