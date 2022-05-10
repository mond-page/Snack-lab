package mond.springboot.security;

import mond.springboot.security.account.Account;
import mond.springboot.security.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    AccountService accountService;

    @Autowired
    public AccountRunner(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account mond = accountService.createAccount("mond", "1234");
        System.out.println(mond.toString());
    }
}
