package com.BankAccount.Bank_Account.services;

import com.BankAccount.Bank_Account.entity.dto.AccountDto;
import com.BankAccount.Bank_Account.entity.dto.AccountResponseDto;

public interface AccountService {
    void createAccount(AccountDto accountDto);

    AccountResponseDto getAccountById(Integer id);
}
