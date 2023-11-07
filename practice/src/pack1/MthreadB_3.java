package pack1;

public class MthreadB_3 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Mthread_3 mt=new Mthread_3();
		mt.start();
		mt.join();
		for(int i=1;i<=5;i++)
		{
			System.out.println("b thread:"+i);
		}
	}

}
