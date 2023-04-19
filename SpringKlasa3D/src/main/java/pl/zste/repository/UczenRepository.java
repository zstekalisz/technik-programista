package pl.zste.repository;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import pl.zste.model.Uczen;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class UczenRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void create(Uczen uczen) {
		entityManager.persist(uczen);
	}
	
	public Uczen readUczenById(Long id) {
		return entityManager.find(Uczen.class, id);
	}
	
	public Uczen updateUczen(Uczen uczen) {
		return entityManager.merge(uczen);
	}
	
	public void deleteUczen(Uczen uczen) {
		entityManager.remove(uczen);
	}
	public List<Uczen> getAllUczens(){
		TypedQuery<Uczen> namedQuery = entityManager.createNamedQuery("GETALL", Uczen.class);
		return namedQuery.getResultList();
	}
	public List<Uczen> getUczensBySurname(String nazwisko){
		TypedQuery<Uczen> namedQuery = entityManager.createNamedQuery("FIND_UCZEN_BY_NAME", Uczen.class);
		namedQuery.setParameter("nazwisko", nazwisko);
		return namedQuery.getResultList();
	}

}
