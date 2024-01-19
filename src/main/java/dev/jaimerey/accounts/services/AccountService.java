package dev.jaimerey.accounts.services;

import dev.jaimerey.accounts.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService {
    public List<Account> findAll();
    public Optional<Account> findById(Integer id);

    public void save(Account account);
    public void delete(Account account);
}
