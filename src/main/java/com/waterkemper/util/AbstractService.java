package com.waterkemper.util;

import com.waterkemper.model.Interessado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractService<T> {

    @PersistenceContext
    private EntityManager em;

    public void persist(T t){
        em.persist(t);
    }

    public void merge(T t){
        em.merge(t);
    }

    public void remove(T t){
        em.remove(t);
    }

    public List<Interessado> list(){
        return em.createQuery("from Interessado", Interessado.class).getResultList();
    }

}
