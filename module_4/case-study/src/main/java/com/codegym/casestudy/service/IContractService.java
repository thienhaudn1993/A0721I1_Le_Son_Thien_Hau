package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findAllContract(Pageable pageable);

    void saveContract(Contract contract);
}
