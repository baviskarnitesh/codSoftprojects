package pack1;

public class Poly1 {

	public  final static void m1() {
		System.out.println(10);
	}
	int  m1(int a) {
		System.out.println(20);
		return 10;
	}
	private final void m1(int a, String s) {
		System.out.println(30);
	}
	static String  m1(String s ,int a) {
		System.out.println(40);
	return s;
	}
	static final protected void m1(String s) {
		System.out.println(50);
	}
	char  m1(StringBuffer sb) {
		System.out.println(60);
		return sb.charAt(0);
	}
	byte m1(byte b) {
		System.out.println(70);
		return 10;
	}
private	boolean  m1(boolean b) {
		System.out.println(80);
		return b;
	}
	void m1(double d) {
		System.out.println(90);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Poly1 p=new Poly1();
System.out.println("Implenting method overloading");
   p.m1();
   p.m1(100);
   p.m1(200,"n");
   p.m1("l",10);
   p.m1("love");
   p.m1(new StringBuffer("java"));
  // p.m1('F');
   p.m1((byte)43);
  p.m1(false);
   p.m1(99.12);
	}

}
