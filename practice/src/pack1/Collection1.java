package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

	void meth1() 
	{
		ArrayList <Integer> al=new <Integer> ArrayList();
		
		al.add(10);       // insertion order is maintained
       // al.add(null);     //Heterogenous data is allowed
    //    al.add("java");  //null is allowed
      //  al.add('A');    //duplicates are allowed
        al.add(30);    //it is available from java 1.2 version
        al.add(5);       // its default value is 10
        al.add(1000);   // its size increases by Half
        al.add(56);     // it is not SYCHRONIZED
        al.add(99);
        
        
        System.out.println("size():"+al.size()); //size 
        System.out.println("get():"+al.get(0));//index position
        
        System.out.println("get():"+al.get(al.size()-1));
        System.out.println("\n");
        
        System.out.println(al); 
        al.add(1,5000);
        System.out.println(al);
        System.out.println("\n");
        
        al.add(al.size(),2000);
        System.out.println(al); 
        System.out.println("\n");
        System.out.println("RETRIEVING the data using for-Loop");
         for( int i=0;i<=al.size()-1;i++) {
        	 System.out.println(al.get(i)+" ");
         }
         System.out.println("\n");
         System.out.println("RETRIEVING the data using for-Loop in reverse order");
        
         for( int i=al.size()-1;i>=0;i--) {
        	 System.out.println(al.get(i)+" ");
         }
         System.out.println("\n");
         
         System.out.println("retrieving the data by using for-each loop ");
         for(int o:al) {
        	 System.out.println(o+"");
         }System.out.println("\n");
         
         
         System.out.println("retrieving the data using Iterator interface");
          Iterator <Integer> i=al.iterator();
          while(i.hasNext()) {
        	  System.out.println(i.next()+"");
        	  System.out.println("\n");
        	  System.out.println("-----method------");
        	  System.out.println("isEmpty():"+al.isEmpty());
        	  
        	  //al.clear();
        	//  System.out.println(al);
        	 System.out.println("contains:"+al.contains(1000)); 
        	 System.out.println("remove():"+al.remove((Object)1000));
        	 System.out.println(al);
          }
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          new Collection1().meth1();
	}

}
