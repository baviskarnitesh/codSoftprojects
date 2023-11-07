package pack1;

public class operator2 {
	int m1() {
		int a= 10;
		a++;
		System.out.println(a++);   //11
		a++;                      //(a=12)
	    System.out.println(++a);    //(12+2=14)
		System.out.println(a++);   // (14) but a=15
		System.out.println(a++);// (15)
	    a--; //14
		System.out.println(--a);//14
		a= a++ +3;
		System.out.println("a value ==>"+a);//17
		System.out.println(a++);//17
		--a;
		System.out.println(--a);//16
		System.out.println(a--);//16
		a=a-- +3;
		return a++ + ++a;
		
	}
	void m2() {
		int a=10;
		int x= new operator2().m1()+a++;
		System.out.println(x++ + a++); //59
		System.out.println(a++);//12 
		System.out.println(a);  //13 
		System.out.println(x);//49 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		new operator2().m2();
		System.out.println("java is awesome"); 
	}

}
