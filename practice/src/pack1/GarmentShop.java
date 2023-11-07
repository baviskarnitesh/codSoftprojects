package pack1;
import java.util.Scanner;
/* WAP  WHICH HAVE  
 *  A switch case:-
 *  in which one if,if-else,if-else-if ladder.
 *  also must have one more switch case
 *  sol:- writing a switch case program as mentioned above with real time Example
 * */
public class GarmentShop {
	 static Scanner sc=new Scanner(System.in);
	public void deal(String Product, int purchase) {

		switch (purchase) {
		case 1000:
			if (Product == "menswear") {
				System.out.println("you will get Exclusive offers on this deal");

			}
			System.out.println("please purchase the products above 5000 to get flat 25% discount");

			break;
		case 2000:
			if (Product == "menswear")
				System.out.println("you will get 1 socks pair (Free) on this purchase ");
			else
				System.out.println(" offer is only applicable on the purchase of menswear");
			System.out.println("please purchase the products above 5000 to get flat 25% discount");
			break;
		case 3000:

			if (Product == "menswear") {
				System.out.println("you will get 1 T-shirt (Free) on this purchase");

			}else if (Product == "LadiesWear") {
				System.out.println("Buy any one of product & get one free");

			}else {
				System.out.println("Offer is only Applicable for Men's & ladies wear");
			}
			System.out.println("Terms & conditions Applied");
			break;

		case 4000:
			System.out.println("you will get Flate 20% discount on this deal");
			System.out.println("buy products  more of rs.1000 to get 25% discount ");
			break;

		case 5000:
			System.out.println("congratulations!!! you are getting 25% discount");
			System.out.println("you can buy more to get more offers");
		}
	}

	void PaymentMethod(String card) {
		switch (card) {
		case "ICICI CARD":

			System.out.println("you will get 2% off on this card payment");

			break;

		case "AMAZON CREDIT CARD":
			System.out.println("you will get 3% off on this card paymnet ");
			break;

		case "HDFC CARD":
			System.out.println("you will get 100 Rs off on this card");
			break;

		default:
			System.out.println("We have recieved  cash payment of Rs \n Thanks!! visit Again ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarmentShop G = new GarmentShop();
		System.out.println("THE GREAT DEAL");
		
		System.out.println("Enter the description of your shopping");
		G.deal(sc.nextLine(), sc.nextInt());
		sc.nextLine();
		//Integer purchase=Integer.parseInt(sc.nextLine());
		System.out.println("------------------------");
		// G.deal("KidsWear",2000 );
		System.out.println("------------------------");
		G.deal("LadiesWear", 3000);
		System.out.println("=========================");
        System.out.println(" payment mode");
		G.PaymentMethod(sc.nextLine());
		System.out.println("THANKS!!!!!VISIT AGAIN");

	}

}
