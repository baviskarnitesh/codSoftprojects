package pack1;
//for static & instance method.
public class Static_test02 {
	int a=10;
	static int b=20;
	void m1() {
		System.out.println("m1()");
		System.out.println("instance :"+a);
		System.out.println("static :"+b);
	}
	/*we can acces a non static variable inside a static method with the help of its 
	respective class object*/
	static void m2() {
		System.out.println("m2()");
		System.out.println("instance :"+new Static_test02().a);
		System.out.println("static :"+ +b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_test02 t=new Static_test02 ();
		t.m1();
		t.m2();
	}

}
