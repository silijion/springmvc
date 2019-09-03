package com.qm.silijion.service.impl;

import com.qm.silijion.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceImplTest {

    @Test
    public void saveAccount() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService accountService = (AccountService) applicationContext.getBean("accountService");

        accountService.findAll();
    }

    @Test
    public void findAll() {

    }
}