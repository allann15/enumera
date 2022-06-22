import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private String name;
    private String email;
    private Date birthDate;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Cliente(String name, String email, Date birthDate) {
        super();
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    
    public Cliente(){

    }
    public String toString(){
        return name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
