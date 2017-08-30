package com.waterkemper.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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




}
