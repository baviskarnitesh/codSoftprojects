package pack1;

//FINAL CAN BE A CLASS ,VARIALBLE OR METHOD 
//ONCE WE MAKE ANYTHING FINAL WE CANT CHANGE IT

public class Final_kw {
	final int a=10;
	   int b=20;
	public void m1() {
	//	System.out.println(a++);
		System.out.println("hi");
		System.out.println(b++);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Final_kw().m1();
	}

}
