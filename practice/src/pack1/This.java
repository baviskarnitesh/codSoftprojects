package pack1;

public class This {
	public int m1(int a,int b) {
		System.out.println("m1() is called");
		System.out.println(b);
		System.out.println(100);
		return (a+b)+10+(a-b);
	}
	public int m2() {
		System.out.println("m2() called");
		return this.m3()+8;
	}
	public This() {
		this("java is awesome");
		System.out.println(50);
	}
	int m3(){
		System.out.println("m3 () called");
		return 10;
	}
	public String m4(int a,String s) {
		System.out.println("m4 () called");
		a=a+4;
		System.out.println("a value :"+a);
		System.out.println("s value :"+s);
		return s+"is object oriented programming language";
	}
	public int m5(int a) {
		System.out.println("m5() called`");
		return 10-a;
	}
        public This(String s) {
        	String result=this.m4(this.m1(this.m2(), this.m5(5)+'A'-('a')), "java");
        	System.out.println(result);
        	System.out.println(s);
        }
        public static void main(String[] args) {
			new This();
		}
}
