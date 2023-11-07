package pack1;
/* A shop will give discount of 10% ,if the cost of purchased quantity 
 * is  equal to less than 1000 .take a parameterized method which have parameters as units 
 * and on  unit will cost 100 an priint the total cost for user  */
public class If_else04 {
	void bill(int units) {
		int finalBill=units*100;
		if (finalBill>=1000) {
			int discount =(finalBill*10)/100;
			System.out.println("congrates!!!you have saved "+discount) ;
			System.out.println("final bill :"+(finalBill-discount));
		}else {
	System.out.println("if you purchase more "+(1000-finalBill)+"\n"+"you will recieve 10% discount on the final bill");
		System.out.println("final bill :"+finalBill);	
		}
	} 
	public static void main(String[] args) {
		If_else04 t2=new If_else04();
		t2.bill(12);
	}

}
