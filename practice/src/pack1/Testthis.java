package pack1;

public class Testthis {
	public int m1(int a ,int b) {
 	   System.out.println("m1()");
 	   System.out.println(b);
 	   return (a+b)+10+(a-b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(new Testthis().m1(18, -27));
          
       
	}

}
