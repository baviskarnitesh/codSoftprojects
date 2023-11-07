
package pack1;
import java.util.Arrays;
import java.util.Scanner;

public class StringTest1 {
	public void m1() 
	{
		System.out.println("implementing String handling methods");
		String s1="nitesh";
		String s2=new String ("nitesh");
		String s3="Nitesh";
		String s4=new String ("nitesh");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals(s3)+"\n");
		
	System.out.println("nitesh".equals("nitesh"));
			System.out.println("nitesh".equalsIgnoreCase("Nitesh"));
			System.out.println(new String("nitesh").equals(new String(new char[] {'n','i','t','e','s','h'})));
			System.out.println("-----------------------------------------------");
			
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s2==s3);
			System.out.println(s2==s4);
			System.out.println(s1=="nitesh");
			System.out.println(new String("nitesh")==s4);
			System.out.println("nitesh"=="nitesh");
			System.out.println(new String ("nitesh")==new String ("nitesh"));
			System.out.println("-------methods()--------------");
			
		System.out.println("s1:"+s1);
			System.out.println("concate:"+s2.concat("is a good boy"));
			System.out.println("concate:"+s1+"isb a good boy");
             System.out.println("========================================");
             System.out.println("length():"+s1.length());
             System.out.println("charAt():"+s1.charAt(2));
             
             System.out.println();
			
			Scanner sc = new Scanner(System.in);
			 System.out.println("enter users gender (M/F)");
			 char age=sc.next().charAt(0);
			 switch(age)
			 {
			 case 'M':
				 System.out.println("user is male");
				 break;
			 case 'F':
				 System.out.println("user is female");
				 break;
				 default:
					 System.out.println("invalid input");
			 }
			 
			 System.out.println("startWith():"+s1.startsWith("ni"));
			 System.out.println("startwith():"+s1.startsWith("ni"));
			 
			 System.out.println("toLowercase():"+s3.toLowerCase());
			 System.out.println("toUppercase():"+s3.toUpperCase());
			 
			 String s5="Java is awesome";
		        System.out.println("substring() : "+s5.substring(8));
		        System.out.println("substring() : "+s5.substring(s5.length()-2));
		        System.out.println("substring() : "+s5.substring(9, 11));
		        System.out.println("substring() : "+s5.substring(3,9));//a is a
		       
		        System.out.println("replace() : "+s5.replace('a', 'A'));
		       
		        String s6=" Hello world ";
		        System.out.println("s6 length : "+s6.length());//13
		        System.out.println("trim() : "+s6.trim().length());//11
		       
		        System.out.println("indexOf() : "+s6.indexOf('o'));
		        System.out.println("lastIndexOf() : "+s6.lastIndexOf('o'));
		       
		        String data="ABCDEF";
		        byte arr[]=data.getBytes();
		        System.out.println("===>"+Arrays.toString(arr));
		       
		        for(byte b:arr)
		        {
		            System.out.print((char)b+" ");
		        }
			 
	}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public static void main(String [] args) {
				StringTest1 t1=new StringTest1 ();
				t1.m1();
			
			
			
			
	}

}
/*
import java.util.Arrays;
import java.util.Scanner;

public class StringTest1
{
   
    void meth1()
    {
        System.out.println("Implementing String Class methods");
       
        String s1="Java";
        String s2=new String("Java");
        String s3="Java";
        String s4=new String("Java");
       
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s1.equals(s3)+"\n");
       
        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java")+"\n");
       
        System.out.println("Java".equals(new String("Java")));
        System.out.println(new String("Java").equals(new String(new char[] {'J','a','v','a'})));
       
        System.out.println("---------------------------------");
       
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s1=="Java");
        System.out.println(new String("Java")==s4);
        System.out.println("Java"=="Java");
        System.out.println(new String("Java")==new String("Java"));
       
        System.out.println("------------Methods()---------------------");
       
        System.out.println("s1 : "+s1);
        System.out.println("concat() : "+s1.concat(" is awesome"));
        System.out.println("concat() : "+s1+" is awesome");
        System.out.println("s1 : "+s1);
       
        System.out.println("length() : "+s1.length());
        System.out.println("length() : "+s1.concat(" is awesome").length());
       
        System.out.println("charAt() : "+s1.charAt(2));
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Gender (M/F)");
        char gender=sc.next().charAt(0);
        switch(gender)
        {
            case 'M':
                System.out.println("User is Male");
                break;
            case 'F':
                System.out.println("User is Female");
                break;
            default :
                System.out.println("Invalid input");
        }        
       
        System.out.println("startsWith() : "+s1.startsWith(" Ja"));
        System.out.println("startsWith() : "+s1.startsWith("Ja"));
       
        System.out.println("toLowerCase() : "+s1.toLowerCase());
        System.out.println("toUpperCase() : "+s1.toUpperCase());
       
        System.out.println("s1 : "+s1);
       
        String s5="Java is awesome";
        System.out.println("substring() : "+s5.substring(8));
        System.out.println("substring() : "+s5.substring(s5.length()-2));
        System.out.println("substring() : "+s5.substring(9, 11));
        System.out.println("substring() : "+s5.substring(3,9));//a is a
       
        System.out.println("replace() : "+s5.replace('a', 'A'));
       
        String s6=" Hello world ";
        System.out.println("s6 length : "+s6.length());//13
        System.out.println("trim() : "+s6.trim().length());//11
       
        System.out.println("indexOf() : "+s6.indexOf('o'));
        System.out.println("lastIndexOf() : "+s6.lastIndexOf('o'));
       
        String data="ABCDEF";
        byte arr[]=data.getBytes();
        System.out.println("===>"+Arrays.toString(arr));
       
        for(byte b:arr)
        {
            System.out.print((char)b+" ");            
        }    
    }
    public static void main(String[] args)
    {
        new StringTest1().meth1();        
    }
}

*/






