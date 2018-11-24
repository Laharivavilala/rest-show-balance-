package com.cg.bankproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.bankproject.beans.Account;

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public double showBalance(int id) {
		 
		Account account=em.find(Account.class, id);
		
			double balance=account.getBalance();
		return balance;
	
		
	}

	
/*	@List<Account> getAllAccounts() {
		Query query1 = em.createQuery("From Account");
		List<Account> myList = query1.getResultList();
		return myList;
	}
*/
}
