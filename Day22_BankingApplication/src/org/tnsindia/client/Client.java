package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;


public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101, "Dipali Bhangrath", 30000, true);
		CurrentAcc c=new MMCurrentAcc(102, "Rahul Bhangrath", 50000, 1500);
		//System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		//System.out.println(s); 
		//System.out.println(c); 
	}

}