package pack1;
import java.util.Scanner;

public class Scann {
	Scanner scn= new Scanner (System.in);
	void meth1( ) {
		System.out.println("please enter 1st num: ");
		int a= scn.nextInt();
		System.out.println(" 1st value:"+a);
		 
		System.out.println("please enter 2nd num: ");
		int b= scn.nextInt();
		System.out.println(" 2nd value:"+b);
		int c=a+b;
		System.out.println("Adddition :"+c);
		
		
	}
	void ComapareEligibility(){
		System.out.println("Enter your name:");
		String name=scn.nextLine();
		System.out.println("what is your age?");
		int age= scn.nextInt();
		
		if(age>=18) {
			System.out.println(name+"you are eligible to vote ");
			
		}else {
		 System.out.println(name+"you arev eligible after "+(18-age)+"years");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scann s= new  Scann();
         s.meth1();
         s.ComapareEligibility();
        // System.out.println("enter parameters for meth1");
      //  s.meth1(s.scn.nextInt(),s.scn.nextInt());
         
	}

}
