package com.haharb.finance_tracker.test;

import com.haharb.finance_tracker.model.Transaction;
import com.haharb.finance_tracker.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TransactionServiceTests {

    @Autowired
    private TransactionService transactionService;

    @org.junit.Test
    @Test
    public void testCreateTransaction() {

        Transaction transaction = new Transaction();

        transaction.setDescription("Test description");
        transaction.setAmount(100.023);
        transaction.setType("Income");
        transaction.setFrequency(30);

        Transaction savedTransaction = transactionService.saveTransaction(transaction);
        assertThat(savedTransaction.getId()).isNotNull();
        assertThat(savedTransaction.getDescription()).isEqualTo("Test transaction");



    }
}
