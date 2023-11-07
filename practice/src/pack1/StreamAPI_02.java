package pack1;

import java.util.ArrayList;
import java.util.stream.*;
public class StreamAPI_02 {
	void m1() {
		System.out.println("implementing stream API");
		ArrayList<String>al= new ArrayList<String>();
		
		al.add("neha");
		al.add("lakshmi");
		al.add("vinanti");
		al.add("rani");
		al.add("vinanti");
		
		/*
		Stream <String> s1=al.stream();
		Stream <String> s2=s1.filter(data->data.length()<=5);
		long num=s2.count();
		System.out.println(num);*/
		System.out.println("no of elements whose length is<=5:"+al.stream().filter(data->data.length()<=5).count());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new  StreamAPI_02().m1();
	}

}
