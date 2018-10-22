package com.project.starter.service;

import com.project.starter.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mahdi on 22/10/2018.
 */

public interface IUserService {
    List<User> findAll();
}
