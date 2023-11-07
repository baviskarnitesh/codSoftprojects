package pack1;

import java.util.LinkedList;
import java.util.ListIterator;
public class Collection4 {
  void m1() {
	  System.out.println("passing user defined class into collection"+"\n");
 LinkedList <Collection5>ll=new LinkedList<Collection5>();
 Collection5 c1=new Collection5("nitesh",210,"java");
 Collection5 c2=new Collection5 ("anu",2102,"aws");
 Collection5 c3=new Collection5("om",45,"cpp");
 Collection5 c4=new Collection5 ("kk",500,"python");
  ll.add(c1);
  ll.add(c2);
  ll.add(c3);
  ll.add(c4);
  System.out.println(ll+"\n");
  
  ll.getFirst();
  System.out.println("implementing getFirst():"+ll+"\n");
  
 ll.getLast();
  System.out.println("implementing getLast():"+ll+"\n");
  
  ll.removeLast();
  System.out.println("after implementing removeLast():"+ll+"\n");
  
  ll.add(new Collection5("raj",300,"oracle"));
  System.out.println("retrieving the data by using iterator"+"\n");
  ListIterator<Collection5 > li=ll.listIterator();
  while(li.hasNext()) {
	  System.out.println(li.next()+" ");
  }
  System.out.println("\n");
  
  
 
  
  }void m2(){
	  LinkedList <Object>ll2=new LinkedList<Object>(); 
	  ll2.add(99);
	  ll2.add(null);
	  ll2.add(true);
	  ll2.add(110);
	  ll2.add(127);
	  System.out.println(ll2+"\n");
	  
	  ll2.getFirst();
	  System.out.println("implementing getFirst():"+ll2+"\n");
	  
	  ll2.getLast();
	  System.out.println("implementing getLast():"+ll2+"\n");
	  
	  ll2.removeFirst();
	  System.out.println("after implementing removeFirst():"+ll2+"\n");
	  
	  ll2.removeLast();
	  System.out.println("after implementing removeLast():"+ll2+"\n");
	  
	  ll2.addFirst(200);
	  System.out.println("after implementing addFirst"+ll2+"\n");
	  
	  ll2.addLast(500);
	  System.out.println("after implementing addLast()"+ll2+"\n");
	  
	  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Collection4().m1();
		new Collection4().m2();
	}

}
