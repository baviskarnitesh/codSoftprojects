package pack1;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection3 {
  void m1() {
	  System.out.println("passing user defined class into collection");
 ArrayList<Collection2>al=new ArrayList<Collection2>();
 Collection2 c1=new Collection2 ("nitesh",210,"java");
 Collection2 c2=new Collection2  ("anu",2102,"aws");
 Collection2 c3=new Collection2 ("om",45,"cpp");
 Collection2 c4=new Collection2  ("kk",500,"python");
  al.add(c1);
  al.add(c2);
  al.add(c3);
  al.add(c4);
  al.add(new Collection2 ("raj",300,"oracle"));
  System.out.println("retrieving the data by using iterator");
  Iterator<Collection2 > i=al.iterator();
  while(i.hasNext()) {
	  System.out.println(i.next());
  }
  
 
  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Collection3().m1();
	}

}
