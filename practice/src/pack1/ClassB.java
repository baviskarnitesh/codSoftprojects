package pack1;

public class ClassB {
	 int a=10;
	 public String testmeth() {
		 new ClassB(100,200,"java");
		 System.out.println(40);
		 return new ClassB().testmeth3(new ClassB(50).testmeth2()+new ClassB().testmeth4("Hi"));
		 
	 }
	 ClassB(){
		 System.out.println("hi");
		 
	 }
          public int testmeth2() {
        	  System.out.println(50);
        	  return 10+15;
          }
          ClassB(int a){
        	  System.out.println("java is awesome");
          }
          public String testmeth3(String a) {
        	  System.out.println(18);
        	  return "is";
          }
          ClassB (int a,int b, String s){
        	  System.out.println(a+b);
        	  System.out.println(s);
          }
          public String testmeth4(String s) {
        	  System.out.println(88);
        	  return "Good";
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ClassB t1=new ClassB();
           t1.a=10;
            ClassB t2=new ClassB(50);
            t2.a=30;
            System.out.println("java"+t1.testmeth()+" "+(t1.a+t2.a-30));
	}

}
