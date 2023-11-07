package pack1;

public interface InterfaceA {
 void m1();//abstract method 
 default  void m2() {
	 System.out.println("interface A default method");
 	 this.m4();
 }
 static void m3() {
	 System.out.println("Interface A static method");
	 
 }
 private void m4() {
	 System.out.println("Interface A private method");
 }
 public static void main(String[] args) {
	System.out.println("Interface A main");
}
}
