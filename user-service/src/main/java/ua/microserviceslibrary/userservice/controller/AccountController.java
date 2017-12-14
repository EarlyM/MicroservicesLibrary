package ua.microserviceslibrary.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.microserviceslibrary.userservice.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    private static final String CREATE_ACCOUNT_MAPPING = "/create";
    private static final String DELETE_ACCOUNT_MAPPING = "/delete";
    private static final String UPDATE_ACCOUNT_MAPPING = "/update";

    @Autowired
    private AccountService accountService;

    @GetMapping()
    public Object getAccount(String accountLogin){
        return accountService.findUserByName(accountLogin);
    }

    @PostMapping(CREATE_ACCOUNT_MAPPING)
    public Object createAccount(@RequestBody Object account){
        return accountService.createUser(account);
    }

    @GetMapping(DELETE_ACCOUNT_MAPPING)
    public void deleteAccount(@RequestBody Object account){
        accountService.deleteUser(account);
    }

    @PostMapping(UPDATE_ACCOUNT_MAPPING)
    public Object updateAccount(@RequestBody Object account){
        return accountService.createUser(account);
    }
}
