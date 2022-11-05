package com.kskr.springjdbcjpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//Repository
//Transaction
@Repository
public class PersonJpaRepository {
    //connect to database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }
}
