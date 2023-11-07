package pack1;

public abstract  class Test_Abstract {

 abstract void m1();
 abstract void m1(String s);
 
 
 static int m2() {
	 System.out.println("parent class ,int method");
	 return 100;
	 
 }
 Test_Abstract(){
	 System.out.println("parent class constructor");
 }
 
 protected String m2(String name) {
	 System.out.println("parent class ,string  method ");
	 return name+"you  are a dashing dude";
 }
 

}
