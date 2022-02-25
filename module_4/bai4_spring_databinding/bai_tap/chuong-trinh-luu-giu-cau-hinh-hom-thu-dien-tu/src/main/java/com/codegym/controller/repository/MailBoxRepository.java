package com.codegym.controller.repository;

import com.codegym.controller.model.MailBox;

import java.util.ArrayList;
import java.util.List;

public class MailBoxRepository implements IMailBoxRepository {
    List<MailBox> mailBoxList = new ArrayList<>();
    @Override
    public void save(MailBox mailBox) {
        mailBoxList.add(mailBox);
    }
}
