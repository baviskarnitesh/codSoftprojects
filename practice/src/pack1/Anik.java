package pack1;

public class Anik {

	
		void meth1()
		{
			System.out.println("-----meth1()-----");
			for (int i=1; i<=5;i++)
			{
				System.out.println("i value : "+i);
			}
			System.out.println("meth1()executed");
		}
		void meth2()
		{
			System.out.println("-----meth2()-----");
			for (int i=1; i<=10; ++i)
			{
				System.out.println("i value : "+i);
			}
			System.out.println("meth2()executed");
		}
		void meth3()
		{
			System.out.println("-----meth3()-----");
			for (int i=1; i<=3;)
			//int x=50 //C.E we can write any declarative statement
				System.out.println("i value : "+ ++i);
				System.out.println("meth3()executed");
		}
		void meth4()
		{
			System.out.println("-----meth4()-----");
			int i=1;
			for (; i<=5 ;)
			{
				System.out.println("i value : "+i);
				i++;
			}
			System.out.println("meth4executed");
		}
		void meth5()
		{
			System.out.println("-----meth5()-----");
			int i=1;
			for (;;)
			{
				System.out.println("i value : "+i);
				i++;
			}
			//System.out.println("meth5executed");	//C.E because of unreachable code
		}
		
		int meth6()
		{
			System.out.println("meth6()called");
			return 'A';
		}
		void meth7()
		{
			System.out.println("------------------");
		}
		void meth8()
		{
			System.out.println("-----meth8()-----");
			for (int i='B'-new Anik().meth6();i<=3;new Anik().meth7()) {
			
				System.out.println("i value : "+ i++);
			
		}System.out.println("meth8()executed");
		}
		void meth9()
		{
			int i=1;
		    for (System.out.println("-------meth9()-------"),System.out.println("------------------");;
				 System.out.println("Java is awesome")) {
		  
				System.out.println("i value : "+ i++);
				break;
		    }
		    
		    System.out.println("meth9()executed");
		}
				
		public static void main(String[] args)
		{
		Anik aobj=new Anik();
	//	aobj.meth1();
	//	aobj.meth2();
	//	aobj.meth3();
	//	aobj.meth4();
	//	aobj.meth5();
	//	aobj.meth8();
		aobj.meth9();
		}
	}