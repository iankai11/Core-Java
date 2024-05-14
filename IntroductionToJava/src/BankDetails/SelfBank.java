package BankDetails;

import java.util.Scanner;

class ImportDetails
{
	private String accName;
	private String accNum;
	private String accType;
	private Long bal;
	Scanner sc = new Scanner(System.in);
	public void openaccount()
	{
		System.out.println("Enter customer's Account name: ");
		accName = sc.next();
		System.out.println("Enter customer's Account number: ");
		accNum = sc.next();
		System.out.println("Enter customer's Account type: ");
		accType = sc.next();
		System.out.println("Enter customer's Account balance: ");
		bal = sc.nextLong();
		
	}
	
	public void showDetails()
     {
		
	System.out.println("customer's Account name: "+accName);
	System.out.println("customer's Account number: "+accNum);
	System.out.println("customer's Account type: "+accType);
	System.out.println("customer's Account balance: "+bal);

     }
	
	public void deposit()
	{
		Long amount;
		System.out.println("Enter the amount to be deposited: ");
		amount = sc.nextLong();
		
		bal+=amount;
		System.out.println("amount after the deposit :"+bal);
	}
	
	public void withdraw()
	{
		Long amount;
		System.out.println("Enter the amount to be withdarwed: ");
		amount = sc.nextLong();
		
		if(bal>=amount) {
		bal-=amount;
		System.out.println("amount after the deposit :"+bal);
		}else
			System.out.println("Transaction failed, insufficient balance!!");
		}
	
	public boolean searchAccount(String accNo)
	{
		if(accNum.equals(accNo)) 
		{
			showDetails();
		return true;
	}
	  else
		return false;
}
}

public class SelfBank {

	public static void main(String[] args)
	{
	
		

	}

}
