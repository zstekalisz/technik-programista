package pl.zste.rest.database;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.zste.rest.endpoints.RestAppEndpoint;
import pl.zste.rest.model.Email;
import pl.zste.rest.model.Student;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class StartDatabaseSingleton {
    @Autowired
    private RestAppEndpoint endpoint;
    @PostConstruct
    public void initObjects(){
        Student student = new Student();
        Email email = new Email();
        email.setEmail("akuswik@kalisz.pl");
        student.setEmail(email);
        student.setName("Antoni");
        student.setSurname("Kuświk");
        student.setSpeciality("bio-chem-math");
        student.setClassNumber(1);
        endpoint.saveStudentInDatabase(student);
    }
}
