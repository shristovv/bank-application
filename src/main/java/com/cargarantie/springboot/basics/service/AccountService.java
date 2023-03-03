package com.cargarantie.springboot.basics.service;

import com.cargarantie.springboot.basics.jpa.model.Account;
import com.cargarantie.springboot.basics.jpa.repository.AccountRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

  private final AccountRepository accountRepository;

  public AccountService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  public Account findAccountByAccountNumber(Account account) {
    return accountRepository.findAccountByAccountNumber(account.getAccountNumber());
  }

  public void addAccount(Account account) {
    accountRepository.save(account);
  }

  public List<Account> getAccounts() {
    return accountRepository.findAll();
  }
}
