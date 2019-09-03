package com.qm.silijion.dao;

import com.qm.silijion.domain.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public void saveAccount(Account account) {


    }

    @Override
    public List<Account> findAll() {
        List<Account> list = sqlSessionTemplate.selectList("account.findAll",1);
        for (Account account : list) {
            System.out.println(account);
        }
        return null;
    }
}
