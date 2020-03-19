package com.chapter4.activity1.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chapter4.activity1.model.Account;
import com.chapter4.activity1.model.Customer;
import com.chapter4.activity1.service.LoginService;



@Controller
@RequestMapping(value="/loginView.htm")
public class LoginController {
    LoginService loginService;
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    @RequestMapping(method=RequestMethod.GET)
    public String showLoginView(ModelMap model)
  {
    Customer customer = new Customer();
    model.addAttribute("CUSTOMER", customer);
    return "loginView";
  }
    
    @RequestMapping(method=RequestMethod.POST)
    public String processForm(@ModelAttribute(value="CUSTOMER") Customer customer,ModelMap model)
    {
        ApplicationContext ac= new ClassPathXmlApplicationContext("com/chapter4/activity1/config/Spring-Config.xml");
        Account act=(Account)ac.getBean("AccountBean");
        String str="Account Number: "+act.getAccountNumber();
        model.addAttribute("accountNumber", str);
        String str1="Account Balance ($): "+act.getBalance();
        model.addAttribute("accountBalance", str1);
        model.addAttribute("helloMessage", loginService.sayHello(customer.getUserName()));
        return "userAccount";
    }
}
