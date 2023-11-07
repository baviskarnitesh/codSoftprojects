package pack1;
import java.io.FileReader;
import java.util.Scanner;
public class EXP_1 {
	static  Scanner scn =new Scanner(System.in);
 public void m1() {
	
	 try 
	 {
		 System.out.println("try block executed");
		 System.out.println("ENTER THE VALUE:");
		System.out.println("===>"+20/scn.nextInt());
		//System.out.println("try block executed");
		
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("catch block executed");
		 
	 }
	 finally 
	 {
		 System.out.println("finally block executed"); 
	 }
	 
 }
 public void m2() 
 {
	 String s=null;
	 try
	 {
		 System.out.println("try block executed");
		 System.out.println(s.length());
	 }
	 catch(NullPointerException npe) 
	 {
		 System.out.println("catch block executed");
		 npe.printStackTrace();
	 }
finally
{
System.out.println("finally block executed");	
} 
	 }
 public void m3() throws Exception {
	try (FileReader fr = new FileReader("D:\\Eclipse\\EmployeeExp.java")){
		//System.out.println("new FileReader("D:\\Eclipse\\EmployeeExp.java)");
	}
	}
 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         new EXP_1().m1();
         new EXP_1().m2();
         new EXP_1().m3();
	}
	//public static void main(String[] args) {
	 
	}


