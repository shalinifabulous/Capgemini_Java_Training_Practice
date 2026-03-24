package com.BankAccount.Bank_Account.config;
import com.BankAccount.Bank_Account.entity.Account;
import com.BankAccount.Bank_Account.entity.dto.AccountDto;
import com.BankAccount.Bank_Account.entity.dto.AccountResponseDto;
public class CustomMapper {

//    public static AccountResponseDto mapAccountToResponse(Account account, AccountResponseDto accountResponseDto)
//    {
//        accountResponseDto.setAccountType(account.getAccountType());
//        accountResponseDto.setAccountId(account.getAccountId());
//        accountResponseDto.setAccountHolderName(account.getAccountholderName());
//        accountResponseDto.setBalance(account.getBalance());
//        return
//
//
//    }

    public static Account mapAccountDtoToAccount(AccountDto accountDto, Account account)
    {
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setAccountType(accountDto.getAccountType());
        account.setAccountSecureKey(accountDto.getAccountSecureKey());
        account.setHolderEmail(accountDto.getHolderEmail());
        account.setBalance(accountDto.getBalance());
        return account;
    }

}

