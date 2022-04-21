package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    @Query(value = "select * from User where username =?1", nativeQuery = true)
    User findByMail(String mail);


}
