package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		AccountService service=new AccountServiceImpl();

		while(true) {
			System.out.println("1. Balance Enquiry: ");
			System.out.println("2. Recharge: ");
			System.out.println("3. Exit ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your mobile no");
				String mobileNo=sc.next();
				Account acc=service.getAccountDetails(mobileNo);
				System.out.println("Balance:"+acc.getAccountBalance());
				break;

			case 2:
				System.out.println("Enter your mobile no");
				String mobileNo1=sc.next();
				System.out.println("Enter amount");
				double rechargeAmount=sc.nextDouble();
				double amount=service.rechargeAccount(mobileNo1, rechargeAmount);
				System.out.println("recharge:"+amount);
				break;

			case 3:
				System.out.println("EXIT");
				System.exit(0);
			}
		}
	}
}