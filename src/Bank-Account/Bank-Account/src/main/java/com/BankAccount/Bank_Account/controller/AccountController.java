package com.BankAccount.Bank_Account.controller;

import com.BankAccount.Bank_Account.constants.AccountConstant;
import com.BankAccount.Bank_Account.entity.Account;
import com.BankAccount.Bank_Account.entity.dto.AccountDto;
import com.BankAccount.Bank_Account.entity.dto.AccountResponseDto;
import com.BankAccount.Bank_Account.entity.dto.AccountType;
import com.BankAccount.Bank_Account.entity.dto.ResponseDto;
import com.BankAccount.Bank_Account.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {


    private final AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody AccountDto accountDto)
    {
        accountService.createAccount(accountDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstant.STATUS_200, AccountConstant.MESSAGE_201, null));

    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<ResponseDto> getAccountByID(@PathVariable Integer id)
    {
        AccountResponseDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(AccountConstant.STATUS_200, AccountConstant.Message_get, accountDto));
    }






}
