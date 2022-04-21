package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Role;
import com.codegym.casestudy.model.User;
import com.codegym.casestudy.repository.IUserRepository;
import com.codegym.casestudy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService implements IUserService, UserDetailsService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByMail(s);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        Set<Role> roles = user.getRoles();
        for (Role role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole_name()));
        }
        return new org.springframework.security.core.userdetails.User(
                user.getUserName(), user.getPassWord(), grantedAuthorities
        );
    }
}
