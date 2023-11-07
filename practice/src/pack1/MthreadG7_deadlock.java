package pack1;

public class MthreadG7_deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
         //    int balance1=4500;
		String name="nitesh";
		int balance=5000;
          Thread t1=new Thread(){
        	  @Override
        	  public void run() {
        	  synchronized(name) {
        		  System.out.println("thread 1 is locked on name"); 
        		  try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}//System.out.println("no deadlock");
        	  }
        	}
          };
          t1.start();
	}
	

}
