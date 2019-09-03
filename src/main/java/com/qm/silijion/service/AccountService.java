package com.qm.silijion.service;

import com.qm.silijion.domain.Account;

import java.util.List;

public interface AccountService {
    public void saveAccount(Account account);
    public List<Account> findAll();
}
