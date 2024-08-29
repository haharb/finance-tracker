package com.haharb.finance_tracker.repository;

import com.haharb.finance_tracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
