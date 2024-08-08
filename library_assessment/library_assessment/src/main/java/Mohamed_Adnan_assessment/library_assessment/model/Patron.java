package Mohamed_Adnan_assessment.library_assessment.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Scope("prototype")
public class Patron {


    @Id

    private int id_patron;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    private String name;
    private String contact_info;

    public int getId_patron() {
        return id_patron;
    }

    public void setId_patron(int id_patron) {
        this.id_patron = id_patron;
    }
    @Override
    public String toString() {
        return "Patron{" +
                "idPatron=" + id_patron +
                ", contactInfo='" + contact_info + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
