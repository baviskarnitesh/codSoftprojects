	package pack1;

public class Test01 {
	void person(String name,int age) {
		if(age>=18) {
		System.out.println(name+"  is eligible for voting");
	}
		else { 
			System.out.println(name+"is not eligible for voting");
			System.out.println(name+"you will be eligible for vote after "+(18-age)+"years");
		}
		} void exam(int age ) {
			if ((age>21 || age<35)){
			System.out.println("eligible for exam");	
			}else {
				System.out.println("not eligible for exam");
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test01 t= new Test01();
      t.person("nitesh", 24);
      t.exam(24);
	}

}
