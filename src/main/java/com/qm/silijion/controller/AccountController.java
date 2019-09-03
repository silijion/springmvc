package com.qm.silijion.controller;

import com.qm.silijion.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accoutService;

    @RequestMapping(value = "/saveAccount")
    public ModelAndView saveAccount(){
        ModelAndView mv = new ModelAndView("success");
        accoutService.findAll();
        return mv;
    }

    @RequestMapping("findAll")
    public ModelAndView findAll(){

        return null;
    }

}
