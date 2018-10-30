package com.project.starter.service.impl;

import com.project.starter.entities.User;
import com.project.starter.repository.UserRepository;
import com.project.starter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mahdi on 22/10/2018.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
