package com.project.starter.repository.impl;

import com.project.starter.entities.User;
import com.project.starter.repository.custom.IUserRepositoryCustom;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by Mahdi on 23/10/2018.
 */


public class UserRepository  {

    @PersistenceContext
    EntityManager entityManager;


//    @Override
//    public boolean logicDelete(User user) {
//        Query query = entityManager.createNativeQuery("update T_USER set USR_DELETED=1 where USR_ID= :userId");
//        query.setParameter("userId", user.getId());
//        query.executeUpdate();
//        return query.executeUpdate() == 1;
//    }
}
