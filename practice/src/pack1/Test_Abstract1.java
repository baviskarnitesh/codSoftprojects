package pack1;

public class Test_Abstract1 extends Test_Abstract{
	@Override
	  void m1() {
		  System.out.println("chid class non parameterized  abstract method overridden");
	  }
	void m1(String s) {
		  System.out.println("chid class  parameterized  abstract method overridden");
	  
		
	}
	protected String m2(String name) {
		 System.out.println("child class ,string  method ");
		 return name+"you  are a dashing dude";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Abstract at=new Test_Abstract1 ();
		Test_Abstract1 at1=new Test_Abstract1 ();
		at.m1();
		at.m2("nitesh");
		at1.m1("java");
		at1.m2("rajaa");
	}
	

}
