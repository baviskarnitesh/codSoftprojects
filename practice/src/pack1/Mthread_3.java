package pack1;

public class Mthread_3 extends Thread {
//public void run () {}
	public void run() {
		String name=Thread.currentThread().getName();
		int Priority=Thread.currentThread().getPriority();
		for (int i=1;i<=5;i++)
		{
			System.out.println("A thread:"+i);
			//System.out.println(name+"("+Priority+")"+"has executed");
		}	
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mthread_3 m=new Mthread_3 ();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);

	//	t1.setName("first-thread");
		//t1.setPriority(4);
		//t2.setName("second-thread");
		//t2.setPriority(1);
	t1.start();
	//t2.start();
	
	}

}
