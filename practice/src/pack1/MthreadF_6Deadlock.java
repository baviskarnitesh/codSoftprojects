package pack1;

public class MthreadF_6Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    final String A="nitesh";
     final String B="Neha";
    // MthreadF_6Deadlock  md=new MthreadF_6Deadlock();
     Thread t1=new Thread(){
    	 //anonymus inner class started
    	 
    		 public void run() {
    			synchronized (A)
    			//thread is holding nitesh
    			{
           System.out.println("THREAD 1 IS LOCKED ON A");
           try {
        	   Thread.sleep(3000);
           }catch(Exception e) 
           {
        	  e.printStackTrace();
           }
           
				} 
    			synchronized (B)//thread is holding neha
    			
    			{
    				 System.out.println("THREAD 1 IS LOCKED ON B");
    		          
    		           }//System.out.println("no deadlock");
					
				}
    		 
    	 
     };//anonymus inner class ends
	 
  
     Thread t2=new Thread() {
    	 //anonymus inner class started
    	 
		 public void run() {
			synchronized (B) //thread is holding neha
			{
       System.out.println("THREAD 2 IS LOCKED ON B");
       try {
    	   Thread.sleep(3000);
       }catch(Exception e) 
       {
    	  e.printStackTrace();
       }
       
			} 
			synchronized (A) 
			//thread is holding nitesh
			{
				 System.out.println("THREAD 2 IS LOCKED ON A");
		           
				
			    }System.out.println("no deadlock");
		     }
	     };
	     t1.start();
	     t2.start();
     }
	
 }
	


