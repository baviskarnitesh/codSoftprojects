package pack1;
/*wap take a parameterized constructor with two
int values and print greatest among them*/

public class If_else01 {
	 If_else01(int a,int b){
		 if(a>b)
			 System.out.println("The greatest number is :"+a);
		 else
			 System.out.println("The greatest number is :"+b);
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 If_else01 t1=new  If_else01(10,5);

	}

}
