package dev.jaimerey.accounts.controllers;

import dev.jaimerey.accounts.model.Account;
import dev.jaimerey.accounts.services.AccountService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexController {

    @Autowired
    AccountService accountService;

    private List<Account> accounts;

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @PostConstruct
    public void init() {
        loadData();
    }

    public void loadData() {
        this.accounts =accountService.findAll();
        System.out.println("Accounts: ");
        accounts.forEach(account -> logger.info(account.toString()));
    }


}
