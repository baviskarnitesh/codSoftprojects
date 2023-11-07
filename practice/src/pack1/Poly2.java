package pack1;
import java.util.Scanner;
public class Poly2 {
	Scanner v=new Scanner(System.in);
	public void empdetails(String dept) {
		empdetails(2500,"nitesh");
		System.out.println("emp dept:"+dept);
	}
 public void empdetails(int fee,String name)  {
	 System.out.println("emp name:"+name);
	 System.out.println("emp fee:"+fee);
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Poly2 p1=new Poly2();
    p1.empdetails(p1.v.next());
	}

}
