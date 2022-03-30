package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.User;
import com.codegym.casestudy.repository.IUserRepository;
import com.codegym.casestudy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository userRepository;
    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
