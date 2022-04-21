package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Role;
import com.codegym.casestudy.repository.IRoleRepository;
import com.codegym.casestudy.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}
