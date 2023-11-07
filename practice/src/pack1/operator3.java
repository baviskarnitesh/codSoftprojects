package pack1;

public class operator3 {
	int m1() {
		int a= 10;
		a++;
		System.out.println(a++);//11
		a++;//12
		System.out.println(++a);//14
		System.out.println(a++);//14
		System.out.println(a++);//15
		a--;//14
		System.out.println(--a);//12
		a=a++ +3;//16
		System.out.println("a value ===>"+a);//17
		System.out.println(a++);//17
		--a;//
		System.out.println(--a);//16

		System.out.println(a--);//16
		a=a-- +3;
		return a++ + ++a;//38
    }
	void m2() {//from main()
		int a=10;
		int x=new operator3().m1()+a++;//intializing constructor & calling m1()=49
		System.out.println(x++ +a++);//59
		System.out.println(a++);//12
		System.out.println(a);//13
		System.out.println(x);//49


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start"); //start
		new operator3().m2();//intializing constructor & calling m2()
		System.out.println("java is awesome");//java is awesome


	}

}
