package com.example.LATC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LATC.entity.MoneyReceipt;

@Repository
public interface MoneyReceiptRepository extends JpaRepository<MoneyReceipt, Integer>{

}
