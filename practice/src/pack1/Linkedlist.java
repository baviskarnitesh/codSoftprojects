package pack1;

import java.util.LinkedList;
import java.util.ListIterator;
public  class Linkedlist {
	void m1() {
		
		System.out.println("retrieving the data using LINKEDLIST");
		LinkedList<Object>ll=new LinkedList<Object>();
		
		ll.add(10);//insertion oreder is maintained
		ll.add("java");//heterogenous data is allowed
		ll.add(null); //nulls are allowed
		
		ll.add(10);//duplicates are allowed
		ll.add(56);//its is available from java 1.2v
		ll.add(41);//it default capacity is 0
		
		ll.add(9);//its size increases by double
		ll.add(12);//it is not synchronized
		ll.add(1);                    		
		
		
		System.out.println(ll+"\n");
		System.out.println("retrieving the data using the list iterator");
		ListIterator<Object>li=ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next()+" ");
		}
		System.out.println("\n");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}System.out.println("\n");
		
		}
	public static void main(String[] args) {
		new Linkedlist().m1();
	}
}
