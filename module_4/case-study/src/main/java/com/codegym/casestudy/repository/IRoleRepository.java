package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query(value = "select * from Role where role_name =?1", nativeQuery = true)
    Role findByName(String name);
}
