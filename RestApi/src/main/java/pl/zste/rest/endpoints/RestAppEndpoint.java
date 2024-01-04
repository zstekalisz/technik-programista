package pl.zste.rest.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pl.zste.rest.model.Email;
import pl.zste.rest.model.Student;
import pl.zste.rest.repositories.EmailRepository;
import pl.zste.rest.repositories.StudentRepository;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class RestAppEndpoint {
    @Autowired
    public RestAppEndpoint(StudentRepository repository, EmailRepository emailRepository){
        this.emailRepository= emailRepository;
        this.repository = repository;
    }

    private StudentRepository repository;

    private EmailRepository emailRepository;

    public Student getStudentById(Long id){
        return  repository.findById(id);
    }

    public List<Student> getAllStudents(){
        return repository.readAll();
    }

    public Student updateStudent(Student student){
        return  repository.update(student);
    }

    public void deleteStudent(Student student){
        repository.delete(student);
    }
    public Student saveStudentInDatabase(Student student){
        return repository.create(student);
    }
    public Email getEmailById(Long id){
        return  emailRepository.findById(id);
    }

    public List<Email> getAllEmails(){
        return emailRepository.readAll();
    }

    public Email updateEmail(Email email){
        return  emailRepository.update(email);
    }

    public void deleteEmail(Email email){
        emailRepository.delete(email);
    }
    public Email saveEmailInDatabase(Email email){
        return emailRepository.create(email);
    }
}
