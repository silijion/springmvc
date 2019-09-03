package com.qm.silijion.service.impl;

import com.qm.silijion.dao.AccountDao;
import com.qm.silijion.domain.Account;
import com.qm.silijion.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("aaaa");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("bbb");
        accountDao.findAll();
        return null;
    }
}
