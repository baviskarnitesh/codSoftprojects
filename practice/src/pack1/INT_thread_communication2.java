package pack1;

public class INT_thread_communication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INT_thread_communication1 it=new INT_thread_communication1();
		/*new Thread() //first thread
		{//anonymus java inner class starts here
			@Override
			public void run() {
				try {
					it.with_draw(40000);
				}
				catch(InterruptedException e) {
				e.printStackTrace();
				}
			}
			
			
			
		}//anonymus java inner class ends here
		.start();*/
		
		new Thread() //second thread
		{//anonymus java inner class starts here
			@Override
			public void run() {
				it.deposite_amount(60000);
			}
	}.start();

}
}