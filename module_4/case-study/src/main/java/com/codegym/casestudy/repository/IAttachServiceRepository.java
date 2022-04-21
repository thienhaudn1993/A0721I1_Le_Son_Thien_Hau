package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttachServiceRepository extends JpaRepository<AttachService, Long> {
}
