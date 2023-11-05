package btechBiryaniCentre;

import java.util.Scanner;
//import java.util.*;  
public class MainClass 
{
	static int confirm=1;
	Scanner sc=new Scanner(System.in);
	Menu menuobj=new Menu();
	FullMenu fmenuobj=new FullMenu();
	Selectitems selobj=new Selectitems();
	
	static
	{
		System.out.println("<--Welcome to BBC-->");
		System.out.println("B.Tech Biryani Centre");
		System.out.println();
	}
	public static void main(String[] args)   //1st
	{
		MainClass mainobj=new MainClass();
		Scanner sc=new Scanner(System.in);
		mainobj.welcome();
		System.out.println("How would you rate your Experience? (Out of 5 stars '*')");
		System.out.println("Please Enter * and not numbers");
		String rating=sc.next();
		System.out.println("THANK YOU");
		sc.close();
	}
	public void welcome()
	{
		MainClass mainobj=new MainClass();
		int ch=menuobj.menu(); //for menu code intake
		int subch=menuobj.submenu(ch); //for menu subsection intake
		for(int i=1;i<=3;i++) //3 wrong attempts... ***BOOM***
		{
			if(subch==1)
				subch=menuobj.submenu(ch=sc.nextInt());
			if(i==3 & subch==1)
			{
				System.out.println("You should've chosen Wisely...\n Now Go and run the program again from the Start");
				return;
			}
		}
		
		do  //to see full menu or seperate section of menu
		{
		if(subch==999)
		{
			fmenuobj.fullmenu();
			break;
		}
		else if(subch==888)
		{
			System.out.println("Enter Menu Section Number : ");
			subch=menuobj.submenu(subch=sc.nextInt());
		}
		else
		{
			
			break;
		}
		}while(subch==999 | subch==888);
		
		do
		{
		mainobj.reselect();
		confirm=sc.nextInt();
		if(confirm==1)
		{
			new Billing().billing();
			return;
		}
		else if(confirm==2)
		{
			fmenuobj.fullmenu();
			mainobj.reselect();
		}
		else
		{
			System.out.println("Thank You!!! Visit Again");
			return;
		}
		}while(confirm!=2);
		
	}
	public void reselect()
	{
		System.out.println("Enter the '3' digit Item Code for Selecting Food Items : ");
		selobj.selectitems();
		System.out.println();
		selobj.preview();
	}
}
	
