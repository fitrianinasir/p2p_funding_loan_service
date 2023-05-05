package com.p2p.funding_loan.repository;

import com.p2p.funding_loan.model.FundingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FundingRepository extends JpaRepository<FundingModel, Integer> {
    List<FundingModel> findAll();
    FundingModel findFundingById(Integer aInteger);

}
