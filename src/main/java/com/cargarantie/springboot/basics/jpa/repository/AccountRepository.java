package com.cargarantie.springboot.basics.jpa.repository;

import com.cargarantie.springboot.basics.jpa.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

  Account findAccountByAccountNumber(String accountNumber);
}
