package myPack;
import java.util.Scanner;
public class Account {
    Customer c1=new Customer();
    double balance;
    long AccountNum;
    String BKID;
    float RateOfInterest;
     Scanner scn=new Scanner(System.in);
      
    protected double deposit(double amount) 
    {       
    	double TotalBalance=balance+amount;
    	System.out.println("total amount:"+(balance+amount)); 
    	return TotalBalance;
    	
    }
    protected double withdraw(double amount) 
    {
    	double  TotalBalance=balance-amount;
    	if(amount<=balance) 
    	{
    		System.out.println(" balance:"+(balance-amount));
    	}
    else {
    	System.out.println("Insufficient Funds"+"\n"+"your account balance is:");
     } 
    	 return balance;
    	}
	}


