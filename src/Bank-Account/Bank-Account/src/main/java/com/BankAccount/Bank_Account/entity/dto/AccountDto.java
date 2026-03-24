package com.BankAccount.Bank_Account.entity.dto;

public class AccountDto {

    private Long balance;
    private AccountType accountType;
    private Integer accountId;
    private String accountHolderName;

    // ✅ Missing fields added
    private String accountSecureKey;
    private String holderEmail;

    // ✅ Getter
    public AccountType getAccountType() {
        return accountType;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // ✅ Fixed getters
    public String getAccountSecureKey() {
        return accountSecureKey;
    }

    public String getHolderEmail() {
        return holderEmail;
    }

    // ✅ Optional setters (recommended)
    public void setAccountSecureKey(String accountSecureKey) {
        this.accountSecureKey = accountSecureKey;
    }

    public void setHolderEmail(String holderEmail) {
        this.holderEmail = holderEmail;
    }
}