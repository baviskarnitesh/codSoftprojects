package pack1;

public class WHILE1 {
	 void m1() {
		 System.out.println("------m1()--------");
		 for (int i=1;i<=5;i++) {
			 System.out.println("i value :"+i);
		 }
		 System.out.println("m1 ()is executed");
		 
	 }
	 void m2() {
		 System.out.println("----m2()---------");
		 for (int i=1;i<=10;++i) {
			 System.out.println("i value :"+i);
		 }
		 System.out.println("m2() executed");
	 }
	 void m3() {
		 System.out.println("------m3()------");
		 for(int i=1;i<=3;) {
			 //int x=50;
			 System.out.println("i value :"+i);
			 System.out.println("m3() executed");
		 }
	 }void m4(){
		 System.out.println("---m4()-------");
		 int i=1;
		 for (;i<=5;) {
			 System.out.println("i value :"+i);
			 i++;
			
		 }System.out.println("m4() executed");
			 
	 }void m5(){
		 System.out.println("-----m5()---------");
		 int i=1;
		 for (;;) {
			 System.out.println("i value:"+i);
			 i++;
			 
		 }
		 //System.out.println("m5() executed");[unreachable code]
	 }
	 int m6() {
		 System.out.println("m6()called");
		 return 'A';
		 
	 } 
	 void m7()
{
		 System.out.println("--------------------");
		 }
	 void m8() {
		 System.out.println("--------m8()----------");
		 for(int i='B'- new WHILE1().m6();i<=3;new WHILE1().m7()) {
			 System.out.println("i value:"+ i++);
		 }System.out.println("m8()executed");
		 
	 } void m9() {
		 int i=1;
		 for (System.out.println("------m9()-----"),System.out.println("----------------");;System.out.println("java is aweosme"))
		 {
			 System.out.println("i value :"+ i++);
			 break;
		 } System.out.println("m9 executed");
		 
	 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WHILE1 w=new WHILE1();
		//w.m1();
		//w.m2();
		//w.m3();
		//w.m4();
		//w.m5();
		//w.m8();
		w.m9();
	}

}
