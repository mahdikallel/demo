package com.project.starter.demo;

import com.project.starter.demo.config.JpaConfig;
import com.project.starter.entities.User;
import com.project.starter.repository.UserRepository;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mahdi on 23/10/2018.
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {JpaConfig.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class UseRepositoryIntegrationTests {


    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveAndRetreiveEntity_thenOK() {
        User user = new User();
        user.setAddress("Sfax");
        user.setFirstname("Jhon");
        user.setLastname("ben test");
        user.setUsername("test");
        userRepository.save(user);

        User userFounded = userRepository.findByUsername(user.getUsername());
        Assert.assertEquals(user,userFounded);
    }
}
