package com.codegym.casestudy.model;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contract_detail_id;
    @Min(value = 1, message = "nhap vao so nguyen duong")
    private int quantity;

    @ManyToOne(targetEntity = Contract.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    @ManyToOne(targetEntity = AttachService.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "attach_service_id", nullable = false)
    private AttachService attachService;

    public ContractDetail() {
    }

    public Long getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(Long contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
