package pl.zste.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zste.rest.endpoints.RestAppEndpoint;
import pl.zste.rest.hateoas.EmailDTO;
import pl.zste.rest.hateoas.EmailDTOAssembler;
import pl.zste.rest.model.Email;

@RestController
@RequestMapping(value = "/emails", produces = "application/json")
public class EmailController {

    @Autowired
    public EmailController(RestAppEndpoint endpoint, EmailDTOAssembler assembler){
        this.endpoint=endpoint;
        this.assembler = assembler;
    }
    private RestAppEndpoint endpoint;
    private EmailDTOAssembler assembler;

    @GetMapping("/{id}")
    public ResponseEntity<EmailDTO> getEmailById(@PathVariable Long id){
        Email email = endpoint.getEmailById(id);
        EmailDTO emailDTO = assembler.toModel(email);
        return ResponseEntity.ok(emailDTO);
    }

}
