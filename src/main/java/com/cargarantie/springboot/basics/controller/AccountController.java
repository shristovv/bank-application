package com.cargarantie.springboot.basics.controller;

import com.cargarantie.springboot.basics.jpa.model.Account;
import com.cargarantie.springboot.basics.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
@AllArgsConstructor
public class AccountController {

  @Autowired
  private AccountService accountService;

  @GetMapping(path = {"", "/"})
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accountService.getAccounts());
    return "accounts";
  }

  @GetMapping("/add")
  public String addAccountForm(@ModelAttribute Account account, Model model) {
    model.addAttribute("account", account);
    return "account-add";
  }

  @PostMapping("/add")
  public String addAccountSubmit(@ModelAttribute Account account, Model model) {
    accountService.addAccount(account);
    model.addAttribute("account", account);
    model.addAttribute("accounts", accountService.getAccounts());
    return "accounts";
  }


}
