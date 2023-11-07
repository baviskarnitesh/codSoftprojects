package pack1;
//for static block
public class Static_test03 {
	final static int x;
	static {
		System.out.println("1st static {} block");
		x=50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("java is awesome");
        System.out.println("x :"+x);
	}
	static {
		System.out.println("2nd static {} block");
		System.out.println("x :"+x);
	}
           //x=100; compile time error because final var cannot be converted . 
}
