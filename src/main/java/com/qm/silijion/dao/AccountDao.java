package com.qm.silijion.dao;

import com.qm.silijion.domain.Account;

import java.util.List;

public interface AccountDao {

    /**
     * 保存
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();
}
