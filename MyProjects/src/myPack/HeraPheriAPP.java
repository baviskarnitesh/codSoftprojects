package myPack;

//implementing method overloading

import java.util.Scanner;
public class HeraPheriAPP {

  static Scanner s=new Scanner(System.in);
	public void herapheri(double balance) 
	
	{
		System.out.println("ROKDA KITNA HAI?//means//(HOW MUCH CASH?) :"+balance);
	}
	static void herapheri(boolean VerifyUser,String code ,String name) 
	{
		if(VerifyUser=true)
		System.out.println(name +"  you are a verified user");
		else
			System.out.println("something went wrong");
	}

	private int herapheri(int paisa,int days) 
	{
		System.out.println("==>21 din mein paisa double<==");
		switch(days) {
		case 21:
			System.out.println("congrates!!!!!!!!! you will get rs."+paisa*2+"\t after 21 days");
			System.out.println("***************************************************");
			break;
			default:
				System.out.println("not less or more than 21");
		}
	return 500000000;	
	}

	public void RateUs(int rating) 
	{
		switch(rating) {
		case 1:
		
		System.out.println(" *  out of  ******");
		System.out.println("very bad");
		break;
		case 2:
			System.out.println(" **  out of  ******");
			System.out.println("not bad");
			break;
			
		case 3:
			System.out.println(" ***  out of  ******");
			System.out.println("average");
			break;

		case 4:
			System.out.println(" ****  out of  ******");
			System.out.println("funny");
			break;

		case 5:
			System.out.println(" *****  out of  ******");
			System.out.println("very funny");
			break;

		default:
			System.out.println("enter valid number");
			
	}
}
	 public void  herapheri(String dialouge) 
	{
		Scanner sd=new Scanner(System.in);
		
		
		if(dialouge.equals("babu bhaiyya 1"))
		
		System.out.println("Tu toh Dev Maanus nikla re");
		sd.nextLine();
		
		
		if(dialouge.equals("babu bhaiyya 2"))
			
			System.out.println("utha le re devaa!!");
		
		
		if(dialouge.equals("babu bhaiyya3"))
			
			System.out.println("ye toh apna raju hai re");
		
		
		if(dialouge.equals("kachra seth"))
			
			System.out.println("150 rupaye dega!!!");
		
		
		if(dialouge.equals("shyam"))
			
			System.out.println("GOLMAAL HAI BHAI SAB GOL MAAL HAI");
		
		
		if(dialouge.equals("babu bhaiyya 4"))
			
			System.out.println("ye babu rao  STYLE hai");
		
		
		if(dialouge.equals("raju"))
			
			System.out.println("chai se zyada ketli garam hai");
		
		
		if(dialouge.equals("munna bhai 1"))
			
			System.out.println("abhi majja aayega n bhidu");
		
		}
		
	
			  public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		HeraPheriAPP h=new HeraPheriAPP();
		System.out.println("==========WELCOME TO HERA PHERI APP==========");
		System.out.println("first verify yourself \n enter code and your name "+"\n"+"your code must be any String");
		h.herapheri(h.s.nextBoolean(), h.s.next(), h.s.next());
		System.out.println("-----------------------------------------------------");
		System.out.println("amount section:");
	
		h.herapheri(h.s.nextDouble());
		 h.s.nextLine();
		System.out.println("____________________________________________________"+"\n");
		 
		System.out.println("sir!!we have a good scheme for you?\n can you enter amount=paisa(cash)& time in number of days ");
		System.out.println("AND THE SCHEME IS:");
			System.out.println("****************************************");
	    h.herapheri( h.s.nextInt(),h.s.nextInt());
	    h.s.nextLine();
	    System.out.println("===============================================================");
	    System.out.println("we have some funny  dialouge want to see \n if yes so please enter \n one of the following character" +"\n"
	    + " 1.babu bhaiyya 1,\n 2.babu bhaiyya 2,\n 3.babu bhaiyya 3,\n 4.babu bhaiyya 4, \n 5.kachra seth, \n 6.shyam, \n 7.raju, \n 8.munna bhai 1");
	    System.out.println("-------------------------------------------------");
	    h.herapheri(h.s.nextLine());
	 //  h.s.nextLine();
	   
	    System.out.println("-------------------------------------------------");
	    System.out.println("-------------------------------------------------");
	    
	    System.out.println("want to rate our APP \n enter the number from 1 to 5 to give your feedback )");
	    h.RateUs(h.s.nextInt());
	    System.out.println("thanks for rating!");
	    
	    		
	}



}
