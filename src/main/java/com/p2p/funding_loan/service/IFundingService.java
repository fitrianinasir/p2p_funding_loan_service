package com.p2p.funding_loan.service;

import com.p2p.funding_loan.model.FundingModel;

import java.util.List;

public interface IFundingService {
    List<FundingModel> allFunding();

    Object getFunding(Integer id);
    void insert(FundingModel lenderModel);
    void delete(FundingModel lenderModel);
}
