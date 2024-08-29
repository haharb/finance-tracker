package com.haharb.finance_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.haharb.finance_tracker.service.TransactionService;

@RestController
@RequestMapping("api/transactions")
public class TransactionControlller {

    @Autowired
    private TransactionService transactionService;

    public void helloFunction() {
        System.out.println("Hello world");
    }

}
