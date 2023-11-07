package pack1;

public class Classd {

	int i;
	void meth1(int a)
	{
		System.out.println("meth -------1------ called----------- ");
		if (i<=10) {
			System.out.println("hiiiiiiiiii");
		}
			System.out.println("hello");
			System.out.println("meth 1() executed");
	}
	void meth2(int a)
	{
		System.out.println("meth ---------2--------called-----------");
		if(a<=10) {
			System.out.println("hello");
		}
		System.out.println("hiiiiiiiiiiiii");
		System.out.println("meth2() executed");
	}
	void meth3(int a) 
	{
		System.out.println("meth3 called");
		if(a<=10) {
			System.out.println("if block executed");
			System.out.println("hai");	
		} else {
			System.out.println("else block executed");
			System.out.println("hello");
		}
	}
	void meth4(int a)
	{
		System.out.println("meth 4 called ");
		if(a<=10) {
			//int x=50;
			System.out.println("if block executed");
		} else {
			System.out.println("else block executed:  hello ");
		}
	}
		void meth5(int a )
		{
			System.out.println("meth5 called ");
			System.out.println("haiiii");
			System.out.println("meth5() executed");
		}
		int meth6() 
		{
			System.out.println("meth 6 called");
			return 15;
		}
		int meth7()
		{
			System.out.println("meth 7 called");
			return 0;
		}
		void meth8()
		{
			System.out.println("meth 8 called ");
			Classd aobj=new Classd();
			int a=aobj.meth6();
			if (a<=aobj.meth7()+15) {
				System.out.println("hello");
			} else {
				System.out.println("haiiiii");
			}
			System.out.println(" meth8() executed");
		}
		void meth9(int val)
		{
			System.out.println(" meth 9 called");
			if (val>0) {
				System.out.println(val+":is a positive value");
			}
			else if(val<0) {
				System.out.println(val+":is a negative value");
			}
			else
			{
				System.out.println(val+":is equal to zero");
			}
			System.out.println("meth 9() executed");
		}
	 
		public static void main(String[]args) {
			Classd aobj=new Classd();
			aobj.meth1(5);
			aobj.meth2(50);
			aobj.meth3(5);
			aobj.meth4(5);
			aobj.meth5(50);
			aobj.meth8();
			aobj.meth9(5);		
		}
	}