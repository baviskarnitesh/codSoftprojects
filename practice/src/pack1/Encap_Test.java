package pack1;
import java.util.Scanner;
public class Encap_Test {
static Scanner scn=new Scanner(System.in);
void m1() {
	Encapsulation1 e=new Encapsulation1();
	
	 
System.out.println("enter name:");
e.setSname(scn.nextLine());

System.out.println("enter bramnch:");
e.setSbranch(scn.nextLine());


System.out.println("enter id:");
e.setSid(scn.nextInt());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Encap_Test().m1();
	}

}
