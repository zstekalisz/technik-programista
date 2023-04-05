package pl.zste.rest.hateoas;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Service;
import pl.zste.rest.controllers.EmailController;
import pl.zste.rest.model.Email;
@Service
public class EmailDTOAssembler extends RepresentationModelAssemblerSupport<Email, EmailDTO> {

    public EmailDTOAssembler() {
        super(EmailController.class, EmailDTO.class);
    }

    @Override
    public EmailDTO toModel(Email entity) {
        return createModelWithId(entity.getId(), entity);
    }

    @Override
    protected EmailDTO instantiateModel(Email entity) {
        return new EmailDTO(entity);
    }
}
