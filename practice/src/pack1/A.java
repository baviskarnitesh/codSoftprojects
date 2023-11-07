package pack1;


public class A 
{
public A()
{
	System.out.println("sunday");
	A a= new A(10);
	System.out.println("tuesday");
	String s = a.display("challenged accepted");
	System.out.println("s");
}
public A(int temp) {
	System.out.println("saturday");
	A a = new A(10,20);
	int X = a.m1()+temp;
	System.out.println("===>"+(X+a.m2()));
	System.out.println("monday");
}
  String display(String s) {
	  System.out.println("In the next statment iam returning String value");
	  return s;
	  
  }
  int m1() {
	  return 100;
  }
  int m2() {
	  return 99;
  }
    public A(int data,int temp) {
    	System.out.println("Thursday");
    	System.out.println(data+new A("hi").m2()-temp);
    }
    A(String s){
    	System.out.println(s);
    }
    public static void main (String []args) {
    	A a = new A();
    System.out.println("output verified");
    }











}
