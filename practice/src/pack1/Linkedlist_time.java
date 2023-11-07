package pack1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_time {
	private static Object arr[];
	static {
		arr=new Object[1000000];
		for(int i=0;i<arr.length;i++)  
		{
			arr[i]=new Object();
			
		}
	}	void Arraylist_Time() {
			long start;
			long end;
		ArrayList<Object>al=new	ArrayList<Object>();
		start=System.currentTimeMillis();
		//it is a static method gives the system current time in  milli secs
		for(Object obj1:arr) {
			al.add(obj1);
		}
		end=System.currentTimeMillis();
		System.out.println("ArrayList construction time:"+(end-start));
		}
		
	void linkedlist_time() {
		long start,end;
		LinkedList<Object>ll=new LinkedList<Object>();
		start=System.currentTimeMillis();
		//it is a static method gives the system current time in  milli secs
for(Object obj2:arr) {

ll.add(obj2);

}end=System.currentTimeMillis();
System.out.println("LinkedList construction time:"+(end-start));
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new   Linkedlist_time().Arraylist_Time(); 
	new  Linkedlist_time ().linkedlist_time();
	}

}
