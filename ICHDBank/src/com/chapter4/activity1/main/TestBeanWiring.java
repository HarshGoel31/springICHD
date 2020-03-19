package com.chapter4.activity1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter4.activity1.model.Customer;

public class TestBeanWiring {
	public static void main(String s[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/chapter4/activity1/config/Spring-Config.xml");
		Customer cust = (Customer) ac.getBean("CustomerBean");
		System.out.println("The Values are: ");
		System.out.println(cust.getFirstName());
		System.out.println(cust.getMiddleName());
		System.out.println(cust.getLastName());
		

	}

}