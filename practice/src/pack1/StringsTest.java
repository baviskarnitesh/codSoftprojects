package pack1;

public class StringsTest {
	void m1() {
		System.out.println("IMPLEMENTING STRING HANDLING");
		 String s1="java";
		 String s2=new String ("java");
		 
		 char arr[]= {'j','a','v','a'};
		 
		 String s3= new String (arr);
		 String s4=new String(arr,2,2);
		 System.out.println("s1:"+s1);
		 System.out.println("s2:"+s2);
		 System.out.println("s3:"+s3);
		 System.out.println("s4:"+s4);
		 System.out.println("-------length()-------");
		 
		 System.out.println("s1.length:"+s1.length()); 
		 System.out.println("java".length());
		 System.out.println("java is awesome".length()+"\n");
	}
	void m2() {
		System.out.println("--------m2()---------");
		String s="java";
		System.out.println("Before concat() s value:"+s);
	     //s=s.concat()"is awesome";
		System.out.println("After concat() s value: "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsTest st=new StringsTest();
		st.m1();
		st.m2();
	}

}
