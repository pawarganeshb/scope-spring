package com.ganesh.account;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanScopeApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext();
		contex.scan("com.ganesh.*");
		contex.refresh();

		Account account = (Account) contex.getBean("account");
		System.out.println(account);

		Bank bank = (Bank) contex.getBean("name");
		System.out.println(bank);
	}
}
