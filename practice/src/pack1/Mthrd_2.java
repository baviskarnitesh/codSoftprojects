package pack1;
public class Mthrd_2 implements Runnable{
	public void run(){
		System.out.println("implement interface in multithreading");
	}
	public static void main (String []args) {
		Mthrd_2 m=new Mthrd_2();
		Thread t=new Thread(m);
		System.out.println("");
		t.start();
		t.run();
		
	}

}
