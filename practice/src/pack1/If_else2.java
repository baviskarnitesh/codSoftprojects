package pack1;

public class If_else2 {
	void m1(int a, int b,int c) {
		if (a>b) {
			System.out.println(a+" is greater than "+b);
		}else if (b>c) {
			System.out.println(b+"  is greater than "+c);
		}else {
			System.out.println("enter valid number");
		}if (c>b)
			System.out.println("c is greatest among all");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If_else2 t2= new If_else2();
		t2.m1(100, 200, 100);
	}

}
