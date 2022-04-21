package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.AttachService;
import com.codegym.casestudy.repository.IAttachServiceRepository;
import com.codegym.casestudy.service.IAttachServiceOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceOfService implements IAttachServiceOfService {
    @Autowired
    IAttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAllAttachService() {
        return attachServiceRepository.findAll();
    }

    @Override
    public void save(AttachService attachService) {
        attachServiceRepository.save(attachService);
    }
}
