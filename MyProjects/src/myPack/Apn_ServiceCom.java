package myPack;
import java.util.Scanner;
public class Apn_ServiceCom {
Scanner sc= new Scanner(System.in);
 public Apn_TravelServices  Bus_Service(String location )
 {
	 System.out.println(" Apn_service for BUS BOOKING");
	 return new Apn_TravelServices() ;
 }
 protected void CarBOOKING(boolean verify,String city) 
 {
	 System.out.println("Apn_service for CAR BOOKING");
 }
 void HotelBooking(String location) 
 {
	 System.out.println("welcome to Apn_Service for hotel booking");
	 
 }
 String FoodOrder(String food)
 {
	 System.out.println("welcome to Apn_Service for food orders");
	 return food;
 }
    int booking(double amount,int passenger,int busSno) {
    	return 10000;
    }
}  
