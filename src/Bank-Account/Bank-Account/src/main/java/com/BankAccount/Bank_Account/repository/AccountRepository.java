package com.BankAccount.Bank_Account.repository;

import com.BankAccount.Bank_Account.entity.Account;
import com.BankAccount.Bank_Account.services.AccountService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {



}
