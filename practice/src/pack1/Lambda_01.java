package pack1;

public class Lambda_01 {
	void show() 
	{
		Interfacel1 A=()->System.out.println("Nitesh");
		A.meth1();
		
		Interfacel2 B=(int k,int l)->System.out.println("add:"+(k+l));
		B.meth2(199, 10);
		
		Interfacel3 C=(int m,int n)->
		{
			if (m<100)
			{
				System.out.println("if block ");
				return m;
			}
			else
			{
				System.out.println("else block");
				return n;
			}
		};
		C.m3(50, 20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Lambda_01 ().show();
	}

}
