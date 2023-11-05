package btechBiryaniCentre;

import java.util.Scanner;
public class Selectitems { //4th
	Scanner sc=new Scanner(System.in);
	int price;
	static int totalprice;
	String item;
	static int count;
	int sel;
	String[] itemarr=new String[200];
	
	
	public void selectitems()
	{
		//Selectitems selobj=new Selectitems();
		System.out.println("<====NOTE : Please Enter '0' if you want to stop selection and proceed to Billing at any step====>");
		for(int i=0;i<50;i++)
		{
			sel=sc.nextInt();
			if(sel==0)
				break;
			else if(sel==001 | sel==002 | sel==003 |sel==004)
				price=300;
			else if(sel==101 | sel==102 | sel==103)
				price=600;
			else if(sel==201 | sel==202 | sel==203 |sel==204)
				price=80;
			else if(sel==301 | sel==302 | sel==303)
				price=60;
			else if(sel==401 | sel==402 | sel==403 |sel==404)
				price=320;
			else if(sel==501 | sel==502 | sel==503 |sel==504)
				price=40;
			else if(sel==601 | sel==602 | sel==603 |sel==604)
				price=250;
			else if(sel==701 | sel==702 | sel==703 |sel==704)
				price=160;
			else if(sel==801 | sel==802 | sel==803)
				price=130;
			else if(sel==901 | sel==902)
				price=60;
			else
			{
				System.out.println("Please Enter Correct Item Code");
				continue;
			}
			totalprice+=price;
			//itemarr[i]=new Selectitems().itemname();
			itemarr[i]=this.itemname();
		}
		
	}
	public String itemname()  //5th
	{
		++count;
		if(sel==001)
			item="[001] Rs.300 Spl BBC Biryani";
		else if(sel==002)
			item="[002] Rs.300 BBC Fried Chicken";
		else if(sel==003)
			item="[003] Rs.300 Fish Tikka";
		else if(sel==004)
			item="[004] Rs.300 Chicken Soft Noodles";
		
		else if(sel==101)
			item="[101] Rs.600 Special Mutton Biryani Combo [Serves 2]";
		else if(sel==102)
			item="[102] Rs.600 Season's Special Combo 1(Veg Biryani + Paneer Butter Masala + 4 Rumali Roti";
		else if(sel==103)
			item="[103] Rs.600 Season's Special Combo 2(Veg Manchuria  + Paneer Butter Masala + 4 Rumali Roti";
		
		else if(sel==201)
			item="[201] Rs.80 Chicken 65";
		else if(sel==202)
			item="[202] Rs.80 Chicken Manchurian";
		else if(sel==203)
			item="[203] Rs.80 Chilli Chicken";
		else if(sel==203)
			item="[204] Rs.80 Ginger Chicken";
		
		else if(sel==301)
			item="[301] Rs.60 Dal Fry";
		else if(sel==302)
			item="[302] Rs.60 Dal Tadka";
		else if(sel==303)
			item="[303] Rs.60 Palak Dal";
		
		else if(sel==401)
			item="[401] Rs.320 Paneer Butter Masala";
		else if(sel==402)
			item="[402] Rs.320 Palak Paneer";
		else if(sel==403)
			item="[403] Rs.320 Mixed Veg Curry";
		else if(sel==404)
			item="[404] Rs.320 Kadai Veg";
		
		else if(sel==501)
			item="[501] Rs.40 Tandoori Roti";
		else if(sel==502)
			item="[502] Rs.40 Rumali Roti";
		else if(sel==503)
			item="[503] Rs.40 Butter Roti";
		else if(sel==504)
			item="[504] Rs.40 Butter Naan";
		
		else if(sel==601)
			item="[601] Rs.250 Steamed Rice";
		else if(sel==602)
			item="[602] Rs.250 Zeera Rice";
		else if(sel==603)
			item="[603] Rs.250 Veg Biryani (regular)";
		else if(sel==604)
			item="[604] Rs.250 Paneer Biryani";
		
		else if(sel==701)
			item="[701] Rs.160 Veg Soft Noodles";
		else if(sel==702)
			item="[702] Rs.160 Schezwan Chicken Noodles";
		else if(sel==703)
			item="[703] Rs.160 Veg Fried Rice";
		else if(sel==704)
			item="[704] Rs.160 Mixed Fried Rice";
		
		else if(sel==801)
			item="[801] Rs.130 Shawarma";
		else if(sel==802)
			item="[802] Rs.130 Special Shawarma";
		else if(sel==803)
			item="[803] Rs.130 Spl Shawarma Without Salad";
		
		
		else if(sel==901)
			item="[901] Rs.60 Qurbani Ka Meetha";
		else if(sel==902)
			item="[902] Rs.60 Double Ka Meetha";
		else
			System.out.print("");
		
		return item;
	}
	
	
	public void preview() //6th
	{
		//System.out.println("\033[H\033[2J");
		System.out.println("<--Welcome to BBC-->");
		System.out.println("B.Tech Biryani Centre");
		System.out.println();
		System.out.println("<<<Please Confirm the details>>>");
		System.out.println("---------------------------------");
		
		System.out.println("Code | Price | Items Selected");
		System.out.println("---------------------------------");
		
		for(int i=0;i<20;i++)
		{
			
			if(itemarr[i]==null)
			{
				continue;
			}
			else if(i==19)
				System.out.println("Your Cart is Full");
			else
			{
				System.out.println();
				System.out.println(itemarr[i]);
			}
		}
		System.out.println("---------------------------------");
		System.out.println("Total Selected Items : "+count);
		
		System.out.println();
		System.out.println("Total Price : "+totalprice);
		System.out.println();
		
		System.out.println("Please Confirm the Order");
		System.out.println("------------------------");
		System.out.println(" Press 1 to Confirm to Billing\n Press 2 to Go Back to Menu\n Press 0 to Cancel and Exit");
	}
	
}
