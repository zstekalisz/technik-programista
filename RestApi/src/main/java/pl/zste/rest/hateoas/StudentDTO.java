package pl.zste.rest.hateoas;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import pl.zste.rest.model.Student;
@Relation(value = "student", collectionRelation = "students")
public class StudentDTO extends RepresentationModel<StudentDTO> {

    private String name;
    private String surname;
    private String speciality;
    private Integer classNumber;
    private EmailDTO email;
    private static EmailDTOAssembler emailDTOAssembler = new EmailDTOAssembler();

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
        this.speciality = student.getSpeciality();
        this.classNumber = student.getClassNumber();
        this.email = emailDTOAssembler.toModel(student.getEmail());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public EmailDTO getEmail() {
        return email;
    }

    public void setEmail(EmailDTO email) {
        this.email = email;
    }
}
