package com.project.starter.service;

import com.project.starter.entities.User;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mahdi on 22/10/2018.
 */

public interface IUserService extends Serializable {
    List<User> findAll();
}
