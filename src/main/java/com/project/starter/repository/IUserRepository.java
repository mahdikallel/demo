package com.project.starter.repository;

import com.project.starter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mahdi on 21/10/2018.
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    int countUserByLastname(String lastname);

    void removeByAddressEndsWithAndEnabled(String address, boolean isEnabled);
}
