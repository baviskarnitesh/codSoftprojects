package pack1;

public class MthreadD_3 extends Thread{
    @Override
    public void run(){
    	 criticalResource();
    }
    synchronized  void criticalResource() {
    	String name=Thread.currentThread().getName();
    	int priority=Thread.currentThread().getPriority();
    	System.out.println(name+"("+priority+")"+"entered in run()");
    	for(int i=1;i<=5;i++)
    	{
    		System.out.println(name+"("+priority+")"+":"+i);
    		
    	}
    	System.out.println(name+"("+priority+")"+" out from  run()");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthreadD_3 mt= new MthreadD_3();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
      t1.setName("my-name");
	    t2.setName("your-name");
	    
	    t1.setPriority(1);
	    t1.setPriority(10);
	    t1.start();
	    t2.start();
	}}    