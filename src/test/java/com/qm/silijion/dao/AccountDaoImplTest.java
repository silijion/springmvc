package com.qm.silijion.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountDaoImplTest {


    @Test
    public void saveAccount() {
    }

    @Test
    public void findAll() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");

        accountDao.findAll();

    }
}
