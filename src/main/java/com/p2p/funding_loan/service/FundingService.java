package com.p2p.funding_loan.service;

import com.p2p.funding_loan.model.FundingModel;
import com.p2p.funding_loan.repository.FundingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundingService implements IFundingService{

    @Autowired
    FundingRepository fundingRepository;

    @Override
    public List<FundingModel> allFunding(){
        return fundingRepository.findAll();
    }

    @Override
    public Object getFunding(Integer id){
        return fundingRepository.findById(id);
    }
    @Override
    public void insert(FundingModel fundingModel){
        fundingRepository.save(fundingModel);
    }


    @Override
    public void delete(FundingModel fundingModel){
        fundingRepository.deleteById(fundingModel.getId());
    }

}
