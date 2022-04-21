package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Contract;
import com.codegym.casestudy.repository.IContractRepository;
import com.codegym.casestudy.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository contractRepository;

    @Override
    public Page<Contract> findAllContract(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void saveContract(Contract contract) {
        contractRepository.save(contract);
    }
}
