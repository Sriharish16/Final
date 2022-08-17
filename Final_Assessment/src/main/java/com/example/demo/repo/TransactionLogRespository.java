package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Transactionlog;

public interface TransactionLogRespository extends JpaRepository<Transactionlog, Integer> {

}
