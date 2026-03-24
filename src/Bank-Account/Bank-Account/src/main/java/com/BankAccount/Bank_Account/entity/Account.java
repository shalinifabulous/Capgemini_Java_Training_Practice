package com.BankAccount.Bank_Account.entity;

import com.BankAccount.Bank_Account.entity.dto.AccountType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private String accountholderName;
    private String holderEmail;
    private String accountSecureKey;
    private Long balance;
    private AccountType accountType;

    public void setAccountHolderName(String accountHolderName) {
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountholderName() {
        return accountholderName;
    }

    public void setAccountholderName(String accountholderName) {
        this.accountholderName = accountholderName;
    }

    public String getHolderEmail() {
        return holderEmail;
    }

    public void setHolderEmail(String holderEmail) {
        this.holderEmail = holderEmail;
    }

    public String getAccountSecureKey() {
        return accountSecureKey;
    }

    public void setAccountSecureKey(String accountSecureKey) {
        this.accountSecureKey = accountSecureKey;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    // private String accountType;
}
