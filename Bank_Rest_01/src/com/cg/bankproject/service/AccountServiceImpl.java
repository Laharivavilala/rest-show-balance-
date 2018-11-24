package com.cg.bankproject.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bankproject.beans.Account;
import com.cg.bankproject.dao.IAccountDao;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements IAccountService {

	@Autowired
	IAccountDao accountDao;
	@Override
	public double showBalance(int id) {
		
		return accountDao.showBalance(id);
	}
	/*@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccounts();
	}*/
	

}
