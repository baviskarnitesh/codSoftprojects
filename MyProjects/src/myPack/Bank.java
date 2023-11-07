package myPack;
import java.util.Scanner;
public class Bank {
     Scanner sc=new Scanner(System.in);
     Account ac=new Account();
     Customer c2=new Customer();
     
	 public void TestBank(double balance) {
		 
		
		System.out.println("========BANK OF INDIA=========");
		System.out.println("Enter customer details===>");
		System.out.print("First Name:");
		String FirstName=sc.nextLine();
		
		System.out.print("Last Name:");
		String LastName=sc.nextLine();
		
		System.out.print("Enter Account number:");
		long AccountNum=sc.nextLong();
		
		sc.nextLine();
		
		System.out.print("Enter BKID:");
		String BKID=sc.nextLine();
		ac.balance=balance;
		System.out.println("Account Balance:"+balance);
	
		System.out.println("Enter **deposite/withdraw** to Desposite (or) withdraw amount ");
		sc.close();
	 }
	void operation(String op) {	
		
	 switch( op) {
	 case "deposite":	 
	 
	 	
		 System.out.println("deposite amount:");
		 System.out.println(ac.deposit(sc.nextDouble()));
		 sc.nextLine();
		 
	 	 break;
	 	
	 case"withdraw":
	          System.out.println("withdraw amount:");
		 
		 System.out.println(ac.withdraw(sc.nextDouble()));
		 sc.nextLine();
	 }
	 }
	private void FD(double balance,double year) {
		
		System.out.println("your ");
		if(balance>50000) {
			  
			 if(year>=1 && year<3)
				 System.out.println("total interest RS"+(balance*7.08*year)/100 );
			 else if(year>=3 && year<5)
				 System.out.println("total interest RS"+(balance*9.23*year)/100);
			 else
				 System.out.println("total interest RS"+(balance*12.33*year)/100);
			 
			  
		  }else {
			  System.out.println("you have to fixed your amount more than 1 year for interest");
		  }
	
		
	}
	      
	  
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Bank b= new Bank();
		b.TestBank(5000);
		
			b.operation(b.sc.next());
			b.sc.nextLine();
			System.out.println("=========>Do you want to fixed deposite your Fund?<========");
			System.out.println("-----we have different F.D. schemes for our branch customers-----");
			System.out.println("1. On depositing money for 1 to 3 years,you will get 7.08% of interest rate");
			System.out.println("2. On depositing money for 3 to 5 years,you will get 9.23% of interest rate");
			System.out.println("3. On depositing money for 5 to 10 years,you will get 12.33% of interest rate");
		 System.out.println("please enter amount and then time in year (use numbers) ");
		 
			b.FD(b.sc.nextDouble(),b.sc.nextDouble());
	}

}
