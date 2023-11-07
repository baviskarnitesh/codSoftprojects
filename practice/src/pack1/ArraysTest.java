package pack1;
import java.util.Arrays;
public class ArraysTest {
	void m1() {
		System.out.println("implenting  java Arrays");
		int arr1[];
		arr1=new int [5];
		
		int arr2[]=new int[6];
		
		int arr3[]= {10,20,30};
		
		int arr4[]=new int[] {1,2,3,4};
		
	    String s="java";
	    System.out.println("s length:"+s.length()+"\n");
	    
	    System.out.println("arr1.length:"+arr1.length);
	    
	    System.out.println("arr2.length:"+arr2.length);
	    
	    System.out.println("arr3 .length:"+arr3.length);
	    
	    System.out.println("arr4 .length:"+arr4.length);
	    
	    System.out.println("arr1:"+Arrays.toString(arr1));
	    
	    System.out.println("arr1:"+Arrays.toString(arr2));
	    
	    System.out.println("arr1:"+Arrays.toString(arr3));
	    
	    System.out.println("arr1:"+Arrays.toString(arr4));
	    
	    arr1[1]=25;
	    arr1[3]=25;
	    
	    System.out.println("arr1:"+Arrays.toString(arr1)+"\n");
	    System.out.println("Retrieving data from an array");
	    System.out.println(arr1[0]);
	    
	    System.out.println(arr1[arr1.length-2]);
	    
	    System.out.println(arr3[arr1.length-arr3.length]);
	    
	    System.out.println(arr2[arr4.length/2]);
	    
	    //System.out.println(arr4[arr4.length]); it generates AIOB exceptions 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new ArraysTest().m1();
	}

}
