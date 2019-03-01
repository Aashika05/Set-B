package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;


public class AccountServiceImpl implements AccountService {
AccountDao dao=new AccountDaoImpl();

		@Override
		public Account getAccountDetails(String mobileNo){
			return dao.getAccountDetails(mobileNo);
		}

		@Override
		public double rechargeAccount(String mobileNo, double rechargeAmount) {
			return dao.rechargeAccount(mobileNo,rechargeAmount);
		     
		}
		
	}

