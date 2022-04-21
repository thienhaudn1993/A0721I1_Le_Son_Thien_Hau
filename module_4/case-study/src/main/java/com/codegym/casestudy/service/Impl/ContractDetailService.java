package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.ContractDetail;
import com.codegym.casestudy.repository.IContractDetailRepository;
import com.codegym.casestudy.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    @Autowired
    IContractDetailRepository contractDetailRepository;

    @Override
    public Page<ContractDetail> findAllContractDetail(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public void saveContractDetail(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
