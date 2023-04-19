package pl.zste.rest.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pl.zste.rest.model.Email;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class EmailRepository extends GenericRepository<Email> {

    @PersistenceContext
    private EntityManager entityManager;

    public EmailRepository() {
        super(Email.class);
    }

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
