package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Role;

public interface IRoleService {
    Role findByName(String name);
}
