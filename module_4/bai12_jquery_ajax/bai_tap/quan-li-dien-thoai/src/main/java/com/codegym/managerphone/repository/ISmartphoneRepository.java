package com.codegym.managerphone.repository;

import com.codegym.managerphone.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
