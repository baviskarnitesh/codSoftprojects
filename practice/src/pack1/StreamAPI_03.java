package pack1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPI_03 {
	void m1() {
		System.out.println("implementing Stream API"+"\n");
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		System.out.println("before:"+al);
		
		Stream<Integer>s1=al.stream();
		Stream<Integer>s2=s1.map(i->i*2);
		List li=s2.collect(Collectors.toList());
		
		Collections.sort(al);
		System.out.println("after:"+al);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new StreamAPI_03 ().m1();
	}

}
