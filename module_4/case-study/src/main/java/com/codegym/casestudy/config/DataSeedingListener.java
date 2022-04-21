package com.codegym.casestudy.config;

import com.codegym.casestudy.model.Role;
import com.codegym.casestudy.model.User;
import com.codegym.casestudy.repository.IRoleRepository;
import com.codegym.casestudy.repository.IUserRepository;
import com.codegym.casestudy.ultil.EncrypPasswordUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;

/**
 * Seeding data test for table users and roles
 */
@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (roleRepository.findByName("ROLE_ADMIN") == null) {
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_MEMBER") == null) {
            roleRepository.save(new Role("ROLE_MEMBER"));
        }
        if (roleRepository.findByName("ROLE_BLOCK") == null) {
            roleRepository.save(new Role("ROLE_BLOCK"));
        }

        //them admin
        if (userRepository.findByMail("admin@gmail.com") == null) {
            User admin = new User();
            admin.setUserName("admin@gmail.com");
            admin.setPassWord(EncrypPasswordUtils.EncrypPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            admin.setRoles(roles);
            userRepository.save(admin);
        }

        //Them Member
        if (userRepository.findByMail("member@gmail.com") == null) {
            User user = new User();
            user.setUserName("member@gmail.com");
            user.setPassWord(EncrypPasswordUtils.EncrypPasswordUtils("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_MEMBER"));
            user.setRoles(roles);
            userRepository.save(user);
        }
    }
}
