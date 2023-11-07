package pack1;
import java.util.HashSet;
import java.util.Iterator;
import java .util.ListIterator;

public class SetPrac_collection {
	public void m1() {
		System.out.println("implementing hashset");
		HashSet<Object>hs=new HashSet<Object>();

		hs.add(10);
		hs.add("ab");
		hs.add(10);
		hs.add(null);
		hs.add(1);
		hs.add(100);
		hs.add(44);
		hs.add(26);
		hs.add(85);
		 System.out.println(hs+"\n");
		 
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SetPrac_collection().m1();
	}

}
