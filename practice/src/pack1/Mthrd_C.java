package pack1;

public class Mthrd_C extends Thread  {
public void run() {
	System.out.println(" HEY! IAM READY FOR INTERVIEW");
	for(int i=1;i<=5;i++){
		System.out.println("THIS IS MY"+i+"INTERVIEW");
		System.out.println("---------------------");
	}
	System.out.println("I GOT PLACED ! RELAXE");
	try {
	Thread.sleep(3000);	
	}
	catch(Exception e) 
	{
		System.out.println("my sleep got distrubd");
	}
	System.out.println("time to goto office");
}

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Mthrd_C  mt=new Mthrd_C();
		Thread t= new Thread(mt);
		t.start();
		//t.interrupt();
	mt.yield();
     System.out.println("NITESH");
      Thread.sleep(3000);
      System.out.println("CHUTIYA");
      Thread.sleep(3000,500);
      System.out.println("AAHE");
      Thread.sleep(3000);
      System.out.println("TU");
      Thread.sleep(3000);
      System.out.println("CHUTIYA");
      Thread.sleep(3000);
	}

}
