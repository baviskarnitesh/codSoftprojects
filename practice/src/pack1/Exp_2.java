package pack1;
import java.util.Scanner;
public class Exp_2 {
static 	Scanner sc=new Scanner(System.in);
public void Excpn(String s){
	
	//=null;
	try {
		System.out.println("hello");
		System.out.println(" value:"+s.length());
		System.out.println("is it correct");
	}
	catch(NullPointerException ae) {
		
		System.out.println("it is  catched");
		System.out.println(ae.getMessage());
		//ae.printStackTrace();
		System.out.println(ae.toString());
	}
	finally {
		System.out.println("yes");
	}
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the values:");
     new Exp_2().Excpn(sc.next());
	}

}
