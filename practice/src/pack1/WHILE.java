package pack1;

public class WHILE {
	void meth1(int i)
	{
		System.out.println("-----------meth1()--------------");
		while(i<=10)
		{
			System.out.println("i value :"+ i);
			i++;
		}System.out.println("meth1() executed");
			
	}
	void meth2(int i) 
	{
		System.out.println("**********meth2()************");
		System.out.println("i value :"+i);
		i++;
		System.out.println("meth2 () executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WHILE w= new WHILE();
		w.meth1(4);

	}

}
