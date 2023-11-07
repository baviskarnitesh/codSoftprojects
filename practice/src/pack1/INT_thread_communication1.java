package pack1;

//it is the process of communicATING two threads with each other by using wait(),notify
	//() and notify all() methods 
	
	


public class INT_thread_communication1 {
	 
	int amount=10000;

	synchronized void with_draw(int amount )throws InterruptedException{
		if (this.amount<amount)
		{
			System.out.println("insufficient funds");
			wait();
			Thread.sleep(1000);
			System.out.println("AMOUNT CREDITED");
			 this.amount=amount;
			 System.out.println("withdraw succesful\n balance is:"+this.amount);
			
		}	
		else {
			this.amount=amount;
			 System.out.println("withdraw succesful\n balance is:"+this.amount);
			
		}
	}
	synchronized void deposite_amount(int amount) {
		this.amount=amount;
		System.out.println("deposite succesfully\n balance is:"+this.amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
