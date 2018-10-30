package com.project.starter.repository.impl;

import com.project.starter.entities.User;
import com.project.starter.repository.custom.UserRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class UserRepositoryImpl implements UserRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional()
    @Override
    public boolean logicDelete(int id) {
        Query query = entityManager.createNativeQuery("UPDATE T_USER SET USR_DELETED=1 WHERE USR_ID= :userId");
        query.setParameter("userId", id);
        query.executeUpdate();
        return query.executeUpdate() == 1;
    }
}
