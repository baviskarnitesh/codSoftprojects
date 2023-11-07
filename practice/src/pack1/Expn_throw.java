package pack1;
import java.io.FileReader;
import java.util.Scanner;
public class Expn_throw {
	int amount;
	public void setAmount(int amount) {
		this.amount = 1000;
	}
	public int getAmount() {
		return amount;
	}
	
 public void meth1(int wdamount) {
	 if(amount<wdamount) {
	 throw new ArithmeticException("insufficient balance");
	
 } else {
	 System.out.println("transaction succesfull");
	 System.out.println("plz collect your cash ");
 }
	 }
/* void fileOpertion()throws Exception{
	 FileReader fr=new FileReader("jsasak");
	 System.out.println("hello");
	 }*/
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Expn_throw a=new Expn_throw();
		a.meth1(1200);
		//a.fileOpertion();
	}

}
