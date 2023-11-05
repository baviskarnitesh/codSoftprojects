package btechBiryaniCentre;

import java.util.Scanner;
public class Billing {
	
	Scanner sc=new Scanner(System.in);
	String name;
	static float discount=0.25f;
	int tip;
	
	public void billing()
	{
		System.out.println("=================");
		System.out.println("Welcome to BBCpay");
		System.out.println("Enter Your Name : ");
		
		name=sc.nextLine();
		System.out.println("Enter your Mobile Number : ");
		long mob=sc.nextLong();
		System.out.println("You're eligible for 25% discount");

		Selectitems selobj=new Selectitems();
		discount=discount*(float)selobj.totalprice;
		System.out.println("You save Rs."+discount+" on this order!");
		System.out.println("==========================");
		System.out.println("Confirming Payment");
		selobj.totalprice-=discount;
		System.out.println("Cart Value : "+selobj.totalprice);
		System.out.println("Would you like to add any tip to the Delivery Partner : (Enter '0' if not any)");
		tip=sc.nextInt();
		System.out.println("==========================");
		System.out.print("Your total bill is :"+(selobj.totalprice+tip)+"\n");
		System.out.println("==========================");
		System.out.println("Redirecting...\nTaking to the Payment Gateway\nLoading...\nServer Busy\n\n\nPayment Method Updated\nCash On Delivery Available\nPlease Pay Rs."+(selobj.totalprice+tip)+" the time of Delivery\n\nThank You!!! Visit Again");
	}
	
}
