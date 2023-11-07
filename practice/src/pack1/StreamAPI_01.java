package pack1;

import java.util.ArrayList;

public class StreamAPI_01
{
	void meth1() 
	{
		System.out.println("implementing Stream API methods");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(40);
		System.out.println(al+"\n");
		al.forEach(data->System.out.println(data));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new StreamAPI_01().meth1();
	}

}
