package pack1;

public class operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a= 34;//34
 int b= 21;//21
 int c=a++ + ++b;// 34+22=56 but a=35 & b=22
int d =--a + --b + c--;//34+21+56=111
int e= a + +b+ +c+d--;//34+21+55+111=221
 int f= -a+b-- +-c - d++;//-34+21=-13+-55=-68-110= -178  
 int sum= a+b+c+d+e+f;//34+20+55+111+221-178=263
 System.out.println("sum ="+sum);
 //System.out.println(f);
	}

}
