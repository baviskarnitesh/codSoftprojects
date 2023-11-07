package pack1;
//WAP 
public class operator4 {
	void m1(int a, int b, String s) {
		System.out.println(s+(a+b));
		new  operator4().m2(100,99);
	}void m2(int a, int b){
		System.out.println("subtraction :"+(a-b));
		
	}
	 operator4(){
		 System.out.println("divison :"+(10/2));
		
	 }
	 operator4(int x){
		 System.out.println("multiplication :"+(10*x));
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new operator4(10).m1(99, 1, "addition");
	}

}
