package com.codegym.formregistrationvalidation.service;

import com.codegym.formregistrationvalidation.model.User;
import com.codegym.formregistrationvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
