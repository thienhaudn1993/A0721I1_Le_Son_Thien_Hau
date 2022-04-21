package com.codegym.controller.service;

import com.codegym.controller.model.MailBox;
import com.codegym.controller.repository.IMailBoxRepository;
import com.codegym.controller.repository.MailBoxRepository;

public class MailBoxService implements IMailBoxService {
    IMailBoxRepository iMailBoxRepository = new MailBoxRepository();

    @Override
    public void save(MailBox mailBox) {
        iMailBoxRepository.save(mailBox);
    }
}
