package com.may17;

import java.util.Scanner;

class Bank{
	private String accno;
	private String custName;
	private String accType;
	private long balance;
	Scanner sc=new Scanner(System.in);
	
	public void openAccount() {
		System.out.println("Enter your Account Number");
		accno=sc.next();
		System.out.println("Enter Account Type:");
		accType=sc.next();
		System.out.println("Enter Customer Name:");
		custName=sc.next();
		System.out.println("Enter current balance:");
		balance=sc.nextLong();
	}
	public void showAccountDetails() {
		System.out.println("Name of Account Holder:"+custName);
		System.out.println("Account No:"+accno);
		System.out.println("Account Type current/saving:"+accType);
		System.out.println("Current Account Balance:"+balance);
		
	}
	
	public void depositeMoney() {
		long amount;
		System.out.println("Enter how much amount u want deposite:");
		
		amount=sc.nextLong();
		
        balance=balance+amount;
        System.out.println("After deposite balance is:"+balance);
	}
	public void withdrawal() {
		long amount;
		System.out.println("Enter how much amount u want withdraw:");
		
		amount=sc.nextLong();
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Balance After widhraw:"+balance);
		}
		else {
			System.out.println("Transaction failed!!!!! insufficient amount(:");
			
		}
		
	}
	public boolean searchAccount(String accNo) {
		if(accno.equals(accNo)) {
			showAccountDetails();
			return true;
		}
		return false;
	}
}
public class ExceptionBankDetails {

	public static void main(String[] args) throws NoAccountException, WithdrawalException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter How many customers u want to store:");
			
			int size=sc.nextInt();
			
			Bank b[]=new Bank[size];
			
			for(int i=0;i<b.length;i++) {
				b[i]=new Bank();
				b[i].openAccount();
				
			}
			int choice;
			do {

				System.out.println("Welcome To Banking Application!!!!!!!!");
				System.out.println("1.Display Account Details");
				System.out.println("2.Search Account Details");
				System.out.println("3.Deposite Money in Account");
				System.out.println("4.Widhraw Money from Account");
				System.out.println("5.Exit");
				System.out.println("Enter choice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					for(int i=0;i<b.length;i++) {
						b[i].showAccountDetails();
					}
				break;
				
				case 2:
					System.out.println("Enter Account number which u want to search:");
					String accountNumber=sc.next();
					boolean found=false;
					for(int i=0;i<b.length;i++) {
						found=b[i].searchAccount(accountNumber);
						if(found) {
							break;
						}
						if(!found) {
							System.out.println("Search failed!!Account no does not exist");
							throw new NoAccountException("No such Account Exists");
						}
					}
					break;
				case 3:
					System.out.println("Enter Account number which u want to Deposite:");
					 accountNumber=sc.next();
					 found=false;
					for(int i=0;i<b.length;i++) {
						found=b[i].searchAccount(accountNumber);
						if(found) {
							b[i].depositeMoney();
							break;
						}
						if(!found) {
							System.out.println("Search failed!!Account no does not exist");
							throw new NoAccountException("No such Account Exists");
						}
					}
					break;
				case 4 :
						System.out.println("Enter Account number which u want to Widhraw:");
						 accountNumber=sc.next();
						 found=false;
						for(int i=0;i<b.length;i++) {
							found=b[i].searchAccount(accountNumber);
							if(found) {
								b[i].withdrawal();
								break;
							}
							if(!found) {
								System.out.println("Search failed!!Account no does not exist");
								throw new WithdrawalException("Invalid Withdrawal");
							}
						}
						break;
						case 5:
							System.out.println("Bye Bye.........");
						break;
						default:
							System.out.println("Wrong choice!!");
				}
}while(choice!=5);
		}

}
}