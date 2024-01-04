package pl.zste.rest.hateoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import pl.zste.rest.model.Email;

@Relation(value = "email",collectionRelation = "emails")
public class EmailDTO extends RepresentationModel<EmailDTO> {
    private Long id;
    private String email;

    public EmailDTO(Email email) {
        this.id = email.getId();
        this.email = email.getEmail();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
