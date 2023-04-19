package pl.zste.rest.hateoas;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Service;
import pl.zste.rest.controllers.StudentController;
import pl.zste.rest.model.Student;
@Service
public class StudentDTOAssembler extends RepresentationModelAssemblerSupport<Student, StudentDTO> {

    public StudentDTOAssembler() {
        super(StudentController.class, StudentDTO.class);
    }

    @Override
    public StudentDTO toModel(Student entity) {
        return createModelWithId(entity.getId(), entity);
    }

    @Override
    protected StudentDTO instantiateModel(Student entity) {
        return new StudentDTO(entity);
    }
}
