package com.ganesh.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

//	@Bean("account")
//	public Account setInformation() {
//		Account acc = new Account();
//		acc.setHolderName("Ganesh Pawar");
//		acc.setBankType("Current");
//		acc.setTotalBalance(48000);
//		return acc;
//	}
	
	@Bean("name")
	public Bank setData() {
		Bank bank = new Bank();
		bank.setBankName("SBI");
		bank.setLocation("Pune");
		bank.setPinCode(415201);
		return bank;
	}
}
