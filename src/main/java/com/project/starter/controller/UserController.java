package com.project.starter.controller;

import com.project.starter.entities.User;
import com.project.starter.repository.IUserRepository;
import com.project.starter.service.IUserService;
import com.project.starter.service.impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Mahdi on 22/10/2018.
 */
@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


    @Autowired
    IUserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<User>> findAllUsers() {
        LOGGER.info("find All users");
        return  new  ResponseEntity<>(userRepository.findAll(),HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET,produces = "application/json")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        if(userRepository.findById(id).isPresent()){
            return  new  ResponseEntity<User>(userRepository.findById(id).get(), HttpStatus.OK);
        }
        return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
    }


}
