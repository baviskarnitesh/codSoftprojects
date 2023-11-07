package pack1;

public class Static_test04 {
	static int x=Static_test04 .m1();
/* calling static method with the help of its respective class object*/ 
   static int m1() {
	   System.out.println("m1() is called");
	   return 100;
   }	
        static {
        	System.out.println("1st static block :"+x);
        	
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("main is executed :"+x);
	}
	static {
		System.out.println("2nd static block :"+x);
	}

}
