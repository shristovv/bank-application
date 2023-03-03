package com.cargarantie.springboot.basics.service.impl;

import com.cargarantie.springboot.basics.jpa.model.Account;
import com.cargarantie.springboot.basics.jpa.repository.AccountRepository;
import com.cargarantie.springboot.basics.service.AccountService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

  private final AccountRepository accountRepository;

  public AccountServiceImpl(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public Account findAccountByAccountNumber(Account account) {
    return accountRepository.findAccountByAccountNumber(account.getAccountNumber());
  }

  @Override
  public void addAccount(Account account) {
    accountRepository.save(account);
  }

  @Override
  public List<Account> getAccounts() {
    return accountRepository.findAll();
  }
}
