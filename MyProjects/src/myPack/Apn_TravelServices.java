package myPack;
import java.util.Scanner;
public class Apn_TravelServices extends Apn_ServiceCom {
	
	static Scanner scT= new Scanner(System.in);
	
	@Override
	 public Apn_TravelServices  Bus_Service(String location )

	 {
		 System.out.println("Welcome to Apn_service for BUS BOOKING");
		 
		 switch(location) {
		 
		 case "MUMBAI":
			 System.out.println("Two buses are available"+"\n"+"1.hyd-MUMBAI @12.00pm"
		 +"\n"+"2.hyd-MUMBAI @6.00pm");
			 System.out.println("price for one ticket is RS:10000");
			 
			 break;
		 case "CHENNAI":
			 System.out.println("Three buses are available"+"\n"+"1.hyd-CHENNAI @10.00am"
		 +"\n"+"2.hyd-CHENNAI @1.00pm"+"\n"+"3.hyd-CHENNAI @ 8.00pm");
			 System.out.println("price for one ticket is RS:14000");
			 
			 break;
			 
		 case "INDORE":
			 System.out.println("Three buses are available"+"\n"+"1.hyd-INDORE @1.00am"
		 +"\n"+"2.hyd-INDORE @2.00pm"+"\n"+"3.hyd-INDORE @ 9.00pm");
			 System.out.println("price for one ticket is RS:11000");
			 
			 break;
			 
		 case "BANGLORE":
			 System.out.println("Two buses are available"+"\n"+"1.hyd-BANGLORE @9.00am"
		 +"\n"+"2.hyd-BANGLORE @10.00pm");
			 System.out.println("price for one ticket is RS:12000");
			 break;
			 
		default:
			System.out.println("Our service is only for MUMBAI, CHENNAI, INDORE & BANGLORE");
			 
			 
		 }		
		 return new Apn_TravelServices ();
	 }
	@Override
	public void CarBOOKING(boolean verify,String city) 
	 {
		 System.out.println("Welcome to Apn_service for CAR BOOKING");
		 switch(city) {
		 case "NAGPUR":
			 System.out.println("Two cars are available"+"\n"+"1.TOYOTA INNOVA "
		 +"\n"+"2.MAHINDRA XUV");
			 System.out.println("price for one ticket is RS:15000");
			 break;
			 
		 case "VISHAKHAPATNAM":
			 System.out.println("Three cars are available"+"\n"+"1.ERTIGA "
		 +"\n"+"2.MAHINDRA SCORPIO"+"\n"+"3.SWIFT DESIRE");
			 System.out.println("price for one ticket is RS:16000");
			 break;
			 
			 
		 case "PUNE":
			 System.out.println("Three CARS are available"+"\n"+"1.MAHINDRA SCORPIO N"
		 +"\n"+"TOYOTA CAMRY"+"\n"+"3.NEXA GRAND VITARA");
			 System.out.println("price for one ticket is RS:16000");
			 break;
		 case "WARANGAL":
			 System.out.println("TWO CARS are available"+"\n"+"1.NEXA BALENO"
		 +"\n"+"2.MAHINDRA XUV");
			 System.out.println("price for one ticket is RS:10000");
			 break;
			 
		default:
			System.out.println("Our service is only for NAGPUR,VISHAKHAPATNAM,JA & warangal");
		 }	 
			 
	 }
	public int booking(double amount,int passenger,int busSno) {
		
		System.out.println("your amount for  ticket booking  is RS :"+passenger*amount);
		System.out.println("===> payment option<===");
		System.out.println("1.debit card");
		 System.out.println("2.credit card");
		 System.out.println("3.mobile banking");
		 System.out.println("4.UPI payment");
	    	return 10000;
	    }
	
	double PaymentMethod(String paymentmode,double amount) //Overloaded method
	 {
		
		if (paymentmode.equals("credit card")) {
		switch(paymentmode) {
		case "SBI CREDIT CARD":
				System.out.println("you will get 2% off on this card payment");

				break;

			case "AMAZON CREDIT CARD":
				System.out.println("you will get 3% off on this card paymnet ");
				break;

			case "HDFC CARD":
				System.out.println("you will get 100 Rs off on this card");
				break;

			
			}
		
		}else if(paymentmode.equals("mobile banking")){
			System.out.println("redirecting to payment page,,,,,,,,..........");
			System.out.println("something went wrong"+"try to pay by card");
			if(paymentmode.equals("UPI payment"))
				System.out.println("redirecting to payment page,,,,,,,,..........");
			System.out.println("something went wrong"+"try to pay by card");
		}
		       else {
		
			System.out.println("We have recieved   payment of Rs:"+amount+" \n Thanks!!  ");
		}
	 	 
		 
	    	return amount ;	 
	    	}

	
	public static void main(String[] args) {
		Apn_ServiceCom as=new Apn_ServiceCom ();
		
		Apn_ServiceCom as1=new Apn_TravelServices();
		
		Apn_TravelServices as2=new Apn_TravelServices();
		// TODO Auto-generated method stub
		 String card="credit card";
		 
		System.out.println("===========Apn_TravelServices============"+"\n");
		
		System.out.println("*********************************************");
		System.out.println(" ////////TOURS & TRAVELS//////////");
		System.out.println("*********************************************"+"\n");
		System.out.println("*******Type 'JAI-HIND'********** ");
		
		 as.Bus_Service(scT.next());
		// as.CarBOOKING(scT.nextBoolean(),scT.next()) ;
		 
		 System.out.println("=======================================");
		 
		 System.out.println(" for bus ticket booking enter city name ");
        as1.Bus_Service(scT.next());
        
       // as2.Bus_Service("MUMBAI");
		 System.out.println("----------------------------------------");
		// System.out.println(" for car ticket booking enter city name ");
		//as1.CarBOOKING(scT.nextBoolean(),scT.next());
		System.out.println("=======================================");
		
		System.out.println("proceed to book");
		System.out.println("enter amount according to a ticket for a particular city ,no. of passenger and busSno for booking");
		as2.booking(scT.nextDouble(),scT.nextInt(),scT.nextInt());
		scT.nextLine();
		System.out.println("----------------------------------------");
		System.out.println("enter paymentmode name for payment");
		as2.PaymentMethod(scT.nextLine(),scT.nextDouble());
	}

}
