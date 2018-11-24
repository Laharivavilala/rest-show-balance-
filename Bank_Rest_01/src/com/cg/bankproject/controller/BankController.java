package com.cg.bankproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bankproject.beans.Account;
import com.cg.bankproject.service.IAccountService;



@RestController
public class BankController {

	@Autowired
	IAccountService accountService;

	@RequestMapping(value = "/account/showbalance/{id}",  method = RequestMethod.GET,headers = "Accept=application/json")
	public double showBalance(@PathVariable("id") int id) {
         double balance=accountService.showBalance(id);
		
		 return  balance;
	}
	
	/*
	@RequestMapping(value = "/account/display/{id}",  method = RequestMethod.GET,headers = "Accept=application/json")
	public Account display(@PathVariable("id") int id) {
   
		Account ac =accountService.display(id);
		 
		 return ac;
	}*/
	
	
	/*@RequestMapping(value = "/account",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Account> getAllDetails(Model model) {
		return accountService.getAllAccounts();
	}*/

	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String accountSearch() {

		return "showBalance";
	}
*/
}
