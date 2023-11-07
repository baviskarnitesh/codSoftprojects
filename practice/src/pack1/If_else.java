package pack1;

public class If_else {
	void m1(int a)
	{
		System.out.println("----m1()-----");
		if(a<=10) {
			System.out.println("hi");
		}System.out.println("hello");
		System.out.println("m1()executed");
	}
	void m2(int a) {
		System.out.println("----m2()----");
		if(a<=10)
			System.out.println("hi");
		System.out.println("hello");
		System.out.println("m2() executed");
	}
	void m3(int a){
		System.out.println("---m3()---");
				if (a<10) {
					System.out.println("if block executed");
					System.out.println("hi");
				}else {
					System.out.println("else block executed");
					System.out.println("hello");
					System.out.println("m3() executed");
			
				}}
				void m4(int a) {
				System.out.println("---m4()----");
				if(a<=10)
					//int x=50; compile time error because we cant declare a value in this line
			System.out.println("if block executed");
				else
					System.out.println("else block executed");
				System.out.println("hello");
				System.out.println("m4() executed");
	}
				void m5(int a) {
					System.out.println("----m5()----");
					if (true) {
						System.out.println("if block executed");
						System.out.println("Hi");
					}
					else {
						System.out.println("else block executed");// warning dead code
						
					}System.out.println("m5() executed");
				}
				int m6() {
					System.out.println("m6() executed");
					return 10;
				}
				int m7() {
					System.out.println("m7() called");
					return 5;
				}
				void m8() {
					System.out.println("----m8()-----");
					If_else f= new If_else();
					int a= f.m6();
					if (a<=f.m7()+10) {
						System.out.println("hii");
					}else {
						System.out.println("hello");
					}
					System.out.println("m8() is executed");
				}
					void m9(int num) {
						System.out.println("---m9()---");
						if (num>0)
							System.out.println(num+" is a positive number");
						else if(num<0)
							System.out.println(num+ "is a negetive number");
						else
							System.out.println(num +"is equal to 0");
						System.out.println("m9 () executed");
					}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If_else f= new If_else();
		//f.m1(5);
		//f.m2(50);
		//f.m3(5);
		//f.m4(5);
		//f.m5(50);
		//f.m8();
		f.m9(5);
	}

}
