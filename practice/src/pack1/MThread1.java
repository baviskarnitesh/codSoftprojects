package pack1;

public class MThread1 extends Thread  
{
 public void run() {
	System.out.println("hello"); 
	for (int i=1;i<=5;i++) {
		System.out.println("i value:"+i);
	}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThread1 m=new MThread1();
		Thread t=new Thread(m);
		t.start();
		//t.run();
		//t.
	}

}
