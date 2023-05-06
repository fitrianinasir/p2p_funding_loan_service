package com.p2p.funding_loan.controller;

import com.p2p.funding_loan.model.FundingModel;
import com.p2p.funding_loan.repository.FundingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class FundingController {
    @Autowired
    private FundingRepository fundingRepository;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<FundingModel> findAll(){
        return fundingRepository.findAll();
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.OK)
    public FundingModel addFunding(@RequestBody FundingModel fundingModel){

        return fundingRepository.save(fundingModel);
    }

    @GetMapping("funding/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FundingModel findFundingById(@PathVariable("id") Integer id){
        return fundingRepository.findFundingById(id);
    }

    @DeleteMapping("funding/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteFundingById(@PathVariable("id") Integer id){
        fundingRepository.deleteById(id);
        return "Successfully deleted id " + id;
    }



}
