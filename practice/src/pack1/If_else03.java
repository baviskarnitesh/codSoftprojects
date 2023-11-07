package pack1;
/*wap take values of length and breadth of rectangle 
 * from a parameterized method and check
 *  whether its is rectangle or square
 */
public class If_else03 {
	void m1(int length,int breadth) {
		if(length==breadth) {
			System.out.println("this is a square");
		}else {
			System.out.println("this is a rectangle");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If_else03 t1=new If_else03 ();
		t1.m1(5, 10);
	}

}
