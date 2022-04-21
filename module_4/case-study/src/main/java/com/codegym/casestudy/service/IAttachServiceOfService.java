package com.codegym.casestudy.service;

import com.codegym.casestudy.model.AttachService;

import java.util.List;

public interface IAttachServiceOfService {
    List<AttachService> findAllAttachService();

    void save(AttachService attachService);
}
