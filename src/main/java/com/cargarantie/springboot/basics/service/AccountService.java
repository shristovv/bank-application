package com.cargarantie.springboot.basics.service;

import com.cargarantie.springboot.basics.jpa.model.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

  Account findAccountByAccountNumber(Account account);

  void addAccount(Account account);

  Iterable<Account> getAccounts();
}
