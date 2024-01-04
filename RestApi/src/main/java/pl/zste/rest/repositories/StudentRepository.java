package pl.zste.rest.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pl.zste.rest.model.Student;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class StudentRepository extends GenericRepository<Student>{

    @PersistenceContext
    private EntityManager entityManager;

    public StudentRepository() {
        super(Student.class);
    }
    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
