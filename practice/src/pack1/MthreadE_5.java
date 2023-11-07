package pack1;



public class MthreadE_5 implements Runnable{
	@Override
	public void run(){
		String name=Thread.currentThread().getName();
    	int priority=Thread.currentThread().getPriority();
    	synchronized(this) {
    		for(int i=1;i<=5;i++)
        	{
        		System.out.println(name+"("+priority+")"+":"+i);
        		
        	}
        	System.out.println(name+"("+priority+")"+" out from  run()");
        
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MthreadE_5  me=new MthreadE_5 ();
		Thread t1=new Thread(me);
		Thread t2=new Thread(me);
		
		t1.setName("my-name");
	    t2.setName("your-name");
	    t1.setPriority(10);
	    t1.setPriority(1);
	    
	 
	    t1.start();
	    t2.start();
	
	}

}
