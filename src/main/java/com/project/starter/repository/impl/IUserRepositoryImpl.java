package com.project.starter.repository.impl;

import com.project.starter.entities.User;
import com.project.starter.repository.custom.IUserRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class IUserRepositoryImpl implements IUserRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public boolean logicDelete(User user) {
        Query query = entityManager.createNativeQuery("UPDATE T_USER SET USR_DELETED=1 WHERE USR_ID= :userId");
        query.setParameter("userId", user.getId());
        query.executeUpdate();
        return query.executeUpdate() == 1;
    }
}
