package pack1;

public class IncrementDecrementQuize {
	 public static void main(String[] args) 
	    {
		/* case 1==> int i=19, j=29, k;
         
	        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
	        
	    //k=19-18+28-29+18-29+19-28
	      //1-1-11-9=0-11-9=-20
	         
	        System.out.println("i="+i);//19
	        System.out.println("j="+j);//29
	        System.out.println("k="+k);//-20*/

	       /* case 2==> int m = 0, n = 0;
	         
	        int p = --m * --n * n-- * m--;
	        
	        //p= -1*-1*-1*-1
	         
	        System.out.println(p);*/

	      /*  int a=1;
	         
	        a = a++ + ++a * --a - a--;
	        // 1+3*2-2
	         
	        System.out.println(a);
		 */
		 
		/* int x = 001, y=010, z=100;
         
	        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
	        
	         
	        System.out.println("x="+x);//-2
	        System.out.println("y="+y);//11
	        System.out.println("z="+z);//-98
	        System.out.println("i="+i);//-167*/
		 for (int i=3;i<=10;++i) {
			 System.out.println("i value :"+ ++i);
			 
		 }
 }
}