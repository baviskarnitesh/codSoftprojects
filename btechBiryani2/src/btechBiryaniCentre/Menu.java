package btechBiryaniCentre;

import java.util.Scanner;
public class Menu {
	Scanner sc=new Scanner(System.in);
	public int menu()  //2nd
	{
		System.out.println("  Menu  ");
		System.out.println(" ------  \n");
		System.out.println	
		("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println
		("MENU CODE |  [000] Recommended   [100] Combos   [200] Starters   [300] Main Course   [400] Indian Curries   [500] Indian Breads   [600] Rice and Biryani   [700] Fried Rice n Noodles   [800] Shawarma   [900] Desserts");
		System.out.println	
		("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println
		("PRICE |              300             600                80                60                     320               40                            250                     160                  130               60");
		System.out.println	
		("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter '999' for viewing FULL MENU (OR) Enter Menu Code : ");
		int ch=sc.nextInt();
		return ch;
	}
	public int submenu(int subch)  //3rd or
	{
		System.out.println();
		//Menu menuobj=new Menu();
		switch(subch)
		{
		case 000:
			System.out.println("[000] Recommended");
			System.out.println("------------------");
			System.out.println("[001] Spl BBC Biryani");
			System.out.println("[002] BBC Fried Chicken");
			System.out.println("[003] Fish Tikka");
			System.out.println("[004] Chicken Soft Noodles");
			break;
		case 100:
			System.out.println("[100] Combos");
			System.out.println("-------------");
			System.out.println("[101] Special Mutton Biryani Combo [Serves 2]");
			System.out.println("[102] Season's Special Combo 1(Veg Biryani + Paneer Butter Masala + 4 Rumali Roti");
			System.out.println("[103] Season's Special Combo 2(Veg Manchuria  + Paneer Butter Masala + 4 Rumali Roti");
			System.out.println();
			break;
		case 200:
			System.out.println("[200] Starters");
			System.out.println("---------------");
			System.out.println("[201] Chicken 65");
			System.out.println("[202] Chicken Manchurian");
			System.out.println("[203] Chilli Chicken");
			System.out.println("[204] Ginger Chicken");
			break;
		case 300:
			System.out.println("[300] Main Course");
			System.out.println("------------------");
			System.out.println("[301] Dal Fry");
			System.out.println("[302] Dal Tadka");
			System.out.println("[303] Palak Dal");
			System.out.println();
			break;
		case 400:
			System.out.println("[400] Indian Curries");
			System.out.println("---------------------");
			System.out.println("[401] Paneer Butter Masala");
			System.out.println("[402] Palak Paneer");
			System.out.println("[403] Mixed Veg Curry");
			System.out.println("[404] Kadai Veg");
			break;
		case 500:
			System.out.println("[500] Indian Breads");
			System.out.println("--------------------");
			System.out.println("[501] Tandoori Roti");
			System.out.println("[502] Rumali Roti");
			System.out.println("[503] Butter Roti");
			System.out.println("[504] Butter Naan");
			break;
		case 600:
			System.out.println("[600] Rice and Biryani");
			System.out.println("------------------");
			System.out.println("[601] Steamed Rice");
			System.out.println("[602] Zeera Rice");
			System.out.println("[603] Veg Biryani (regular)");
			System.out.println("[604] Paneer Biryani");
			break;
		case 700:
			System.out.println
			("[700] Fried Rice n Noodles");
			System.out.println	
			("---------------------------");
			System.out.println("[701] Veg Soft Noodles");
			System.out.println("[702] Schezwan Chicken Noodles");
			System.out.println("[703] Veg Fried Rice");
			System.out.println("[704] Mixed Fried Rice");
			break;
		case 800:
			System.out.println("[800] Shawarma");
			System.out.println("------------------");
			System.out.println("[801] Shawarma");
			System.out.println("[802] Special Shawarma");
			System.out.println("[803] Spl Shawarma Without Salad");
			System.out.println();
			break;
		case 900:
			System.out.println("[900] Desserts");
			System.out.println("------------------");
			System.out.println("[901] Qurbani Ka Meetha");
			System.out.println("[902] Double Ka Meetha");
			System.out.println();
			System.out.println();
			break;
		case 999:
			FullMenu fmenuobj=new FullMenu();
			fmenuobj.fullmenu();
			break;
		default:
				System.out.println("Enter a correct code( '3' digit Code like 100,200,300 etc :");
				return 1;
		}
		
		System.out.println	
		("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter '999' for viewing FULL MENU (or) Enter '888' for viewing other section of Menu : ");
		System.out.println("<====NOTE : Enter any Random Number for selecting Menu Items====> ");
		int subch2=sc.nextInt();
		return subch2;
	}
}