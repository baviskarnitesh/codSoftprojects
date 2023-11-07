package pack1;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
public class Vector1 {
	public void meth1() {
		System.out.println("implementing Vector");
		Vector<Object> v=new Vector<Object>();
		v .add(10); //insertion order is maintained
		v.add(null);//nulls are allowed
		v.add(10);//duplicates are allowed
		v.add(85);//it is available from java 1.0 v
		v.add(99);//its default capacity is 10
		v.add(1);// it increses its size by DOUBLE
		v.add(15);// it is synchronized
		v.add(true);
		
		System.out.print(v);
		v.add(v.size(),5000);
		v.add(v.size()-1,4000);
		System.out.println("\n");	
		
		for(int i=v.size()-1;i>=0;i--) {
			System.out.print(v.get(i));
		}
		System.out.println("\n");
		for(Object o:v) {
			System.out.print(o+" ");
			
		}System.out.println("\n");
		System.out.println("retrieving the data using Enumeration interface"+"\n");
    Enumeration<Object> e= v.elements(); 
	 while(e.hasMoreElements()) {
		 System.out.print(e.nextElement()+" ");
	 }System.out.println("\n"+" ");
	 System.out.println("retrieving the data using iterator interface"+"\n");

  Iterator<Object> i= v.iterator(); 
	 while(i.hasNext()) {
		 System.out.print(i.next()+" ");
	 }
	 System.out.println("\n");
} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Vector1().meth1();
	}

}
