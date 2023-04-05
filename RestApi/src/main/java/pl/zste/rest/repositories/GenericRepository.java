package pl.zste.rest.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public abstract class GenericRepository<T>{

    protected Class<T> clazz;
    public GenericRepository(Class<T> clazz) {
        this.clazz = clazz;
    }
    abstract EntityManager getEntityManager();

    public T create(T t){
        getEntityManager().persist(t);
        return t;
    }
    public T findById(long id){
        return getEntityManager().find(this.clazz, id);
    }
    public List<T> readAll(){
        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(this.clazz);
        Root<T> from = query.from(this.clazz);
        query.select(from);
        return getEntityManager().createQuery(query).getResultList();
    }

    public T update(T t){
        return getEntityManager().merge(t);
    }
    public void delete(T t){
        getEntityManager().remove(t);
    }
}
